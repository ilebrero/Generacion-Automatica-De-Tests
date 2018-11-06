package org.autotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

import org.autotest.BinaryTree;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeKoratTest {

	@Before
	public void deleteFile() {
		File out = new File("binarytree.ser");
		if (out.exists()) {
			out.delete();
		}
	}

	@Test
	public void runKorat2Node() throws FileNotFoundException, IOException, ClassNotFoundException {
		String[] args = new String[] { "--class", BinaryTree.class.getName(), "--args", "2,2,2", "--serialize",
				"binarytree.ser" };
		korat.Korat.main(args);

		assertTrue(new File("binarytree.ser").exists());

		Set<BinaryTree> generatedTrees = readBinaryTrees("binarytree.ser");
		assertEquals(2, generatedTrees.size());
	}

	@Test
	public void runKorat3Node() throws FileNotFoundException, IOException, ClassNotFoundException {
		String[] args = new String[] { "--class", BinaryTree.class.getName(), "--args", "3,0,3", "--serialize",
				"binarytree.ser" };
		korat.Korat.main(args);

		assertTrue(new File("binarytree.ser").exists());

		Set<BinaryTree> generatedTrees = readBinaryTrees("binarytree.ser");
		assertEquals(9, generatedTrees.size());
	}

	private Set<BinaryTree> readBinaryTrees(String filename)
			throws IOException, FileNotFoundException, ClassNotFoundException {
		Set<BinaryTree> generatedTrees = new HashSet<BinaryTree>();
		File out = new File(filename);
		if (!out.exists()) {
			throw new FileNotFoundException();
		}
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(out));
		try {
			while (true) {
				try {
					BinaryTree binTree0 = (BinaryTree) in.readObject();
					generatedTrees.add(binTree0);
				} catch (EOFException ex) {
					break;
				}
			}
			return generatedTrees;
		} finally {
			in.close();
		}
	}
}
