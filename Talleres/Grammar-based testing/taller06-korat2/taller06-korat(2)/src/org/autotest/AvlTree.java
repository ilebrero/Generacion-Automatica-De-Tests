package org.autotest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

import korat.finitization.IFinitization;
import korat.finitization.IIntSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;

public class AvlTree implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1804587522402026743L;

	private AvlNode root;

	private int size;

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeObject(this.root);
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		this.root = (AvlNode) in.readObject();
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(size);
		buf.append("{");
		if (root != null)
			buf.append(root.toStrings());
		buf.append("}");
		return buf.toString();
	}

	boolean contains(Integer value) {
		AvlNode current = root;
		while (current != null && current.data != value) {
			// if (value.data_lt(current.data))
			if (value.compareTo(current.data) < 0)
				current = current.left;
			else
				current = current.right;
		}
		return current == null;
	}

	/**
	 * @Modifies_Everything
	 * 
	 * @Requires value != null && freshNode !in this.nodes && freshNode != null &&
	 *           freshNode.left = null && freshNode.right = null;
	 *
	 * @Ensures ((some n: AvlNode | n in @old(this.nodes) && n.data = value && ( (
	 *          this.nodes = @old(this.nodes) ) )) && ((no n: AvlNode | n
	 *          in @old(this.nodes) && n.data = value) => ( ( this.nodes =
	 *          ( @old(this.nodes) @+ freshNode ) ) && ( freshNode.data = value )
	 *          ));
	 */
	public void insert(Integer value) {
		AvlNode freshNode = new AvlNode();
		try {
			freshNode.data = value;
			root = insert(root, freshNode);
			// size++;
		} catch (RuntimeException e) {
		}
	}

	private AvlNode insert(AvlNode node, AvlNode freshNode) {
		if (node == null) {
			node = freshNode;
		} else if (freshNode.data < node.data)
			node.left = insert(node.left, freshNode);
		else if (freshNode.data > node.data)
			node.right = insert(node.right, freshNode);
		else
			throw new RuntimeException();
		return restoreBalance(node);
	}

	void delete(Integer value) {
		AvlNode[] nodes = { null, null };
		root = delete(root, value, nodes);
	}

	private AvlNode delete(AvlNode node, Integer value, AvlNode[] nodes) {
		if (node == null)
			return null;
		nodes[1] = node;
		if (value.compareTo(node.data) < 0) {
			node.left = delete(node.left, value, nodes);
		} else {
			nodes[0] = node;
			node.right = delete(node.right, value, nodes);
		}
		if (node == nodes[1]) {
			if (nodes[0] != null && nodes[0].data == value) {
				if (nodes[0] == nodes[1]) {
					node = node.left;
				} else {
					nodes[0].data = node.data;
					node = node.right;
				}
				size--;
			}
		} else {
			node = restoreBalance(node);
		}
		return node;
	}

	int size() {
		if (!repOK())
			return -1;

		return size;
	}

	private AvlNode restoreBalance(AvlNode node) {
		int l_Height = node.left == null ? 0 : node.left.height;
		int r_Height = node.right == null ? 0 : node.right.height;

		if (l_Height > r_Height) {
			int ll_Height = node.left.left == null ? 0 : node.left.left.height;
			int lr_Height = node.left.right == null ? 0 : node.left.right.height;
			if (ll_Height < lr_Height)
				node.left = rotateLeft(node.left);
			node = rotateRight(node);

		} else if (l_Height < r_Height) {
			int rl_Height = node.right.left == null ? 0 : node.right.left.height;
			int rr_Height = node.right.right == null ? 0 : node.right.right.height;
			if (rl_Height > rr_Height)
				node.right = rotateRight(node.right);
			node = rotateLeft(node);
		}

		// fixHeights(node);
		return node;
	}

	private AvlNode rotateLeft(AvlNode node) {
		AvlNode r_node = node.right;
		AvlNode rl_node = r_node.left;
		r_node.left = node;
		node.right = rl_node;
		fixHeights(node);
		fixHeights(r_node);
		return r_node;
	}

	private AvlNode rotateRight(AvlNode rt) {
		AvlNode l_node = rt.left;
		AvlNode lr_node = l_node.right;
		l_node.right = rt;
		rt.left = lr_node;
		fixHeights(l_node);
		fixHeights(rt);
		return l_node;
	}

	private void fixHeights(AvlNode node) {
		int leftHeight = node.left == null ? 0 : node.left.height;
		int rightHeight = node.right == null ? 0 : node.right.height;
		// node.height = 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
		node.height = (leftHeight > rightHeight ? leftHeight : rightHeight);
	}

	/**
	 * invariante de representación de la estructura.
	 * 
	 * @return true si y sólo si la estructura es internamente consistente @pre.
	 *         true @post. Se retorna true si y sólo si el árboles es un AVL, es
	 *         decir es un árbol ordenado (árbol binario de búsqueda) y balanceado,
	 *         y la altura de cada nodo alcanzable desde la raíz corresponde a la
	 *         diferencia de altura de sus subárboles izquierdo y derecho. Además,
	 *         size coincide con el número de elementos del árbol.
	 */
	public boolean repOK() {
		LinkedList<AvlNode> queue = new LinkedList<AvlNode>();
		int elemetsAmount  = 0;

		if (root == null) return false;

        queue.push(root);
		Boolean isValid = true;

		if (hasCicles(root)) return false;
        if (!isABB(root, Integer.MAX_VALUE, Integer.MIN_VALUE)) return false;

        while (isValid && queue.size() > 0) {
			AvlNode current = queue.pollFirst();

            if (current != null) {
                ++elemetsAmount;

                //if (current.height != expectedH) return false;

				queue.push(current.left);
				queue.push(current.right);

				isValid &= balanced(current);
			}
		}

		isValid &= elemetsAmount == this.size;

        int a  = 0;
        if (isValid) {
            a = 2;
        }

		return isValid;
	}

    private boolean isABB(AvlNode current, Integer max, Integer min) {
        Boolean isValid = true;

        if (current == null) return true;

	    if (current.data >= min && current.data < max) {
            isValid &= isABB(current.left, min, current.data);
            isValid &= isABB(current.right, current.data, max);
        } else {
	        isValid = false;
        }

	    return isValid;
    }

    private boolean hasCicles(AvlNode root) {
		return root.toStrings().contains("!tree");
	}

	private boolean todosMax(AvlNode node, Integer data) {
		if (node == null) return true;

		return node.data >= data
				&& todosMin(node.left, node.data)
				&& todosMax(node.right, node.data);
	}

	private boolean todosMin(AvlNode node, Integer data) {
		if (node == null) return true;
		return node.data <= data && todosMax(node.left, data) && todosMax(node.right, data);
	}

	private Boolean balanced(AvlNode current) {
		int leftSize  = (current.left  != null) ? current.left.height  : 0;
		int rigthSize = (current.right != null) ? current.right.height : 0;

		return Math.abs( leftSize- rigthSize) <= 1 && Math.max(rigthSize, leftSize) == current.height - 1;
	}


	public static IFinitization finAvlTree(int treeHeight, int minSize, int maxSize) {
	    Double nodesNum = Math.pow(2, treeHeight);

		IFinitization f = FinitizationFactory.create(AvlTree.class);
		IObjSet nodes = f.createObjSet(AvlNode.class, nodesNum.intValue(), true);
		IIntSet sizes = f.createIntSet(minSize, maxSize);

		f.set("root", nodes);

		f.set("AvlNode.left",   nodes);
		f.set("AvlNode.right",  nodes);

        f.set("size", sizes);
        f.set("AvlNode.data",   sizes);
        f.set("AvlNode.height", sizes);

		return f;
	}
}