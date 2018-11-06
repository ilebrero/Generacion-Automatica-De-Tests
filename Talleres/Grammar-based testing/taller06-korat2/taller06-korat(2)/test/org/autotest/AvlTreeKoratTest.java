package org.autotest;

import static org.junit.Assert.*;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class AvlTreeKoratTest {

	//@Test
	public void testInsertAvlScope3() {
		fail("Not yet implemented");
	}

	@Test
	public void testKoratAvlLvl4() throws FileNotFoundException, IOException, ClassNotFoundException {
		String[] args = new String[] { "--class", AvlTree.class.getName(), "--args", "2,0,4", "--serialize",
				"avltree.ser"};
		korat.Korat.main(args);

		assertTrue(new File("avltree.ser").exists());

		Set<AvlTree> generatedTrees = readAvlTrees("avltree.ser");
		assertEquals(5, generatedTrees.size());
	}

	// --------------------------------------  Ejercicio 3 -------------------------------------- //
	@Test
	public void testKoratAvlLvl4Appending() throws FileNotFoundException, IOException, ClassNotFoundException {
		String[] args = new String[]{"--class", AvlTree.class.getName(), "--args", "4,0,4", "--serialize",
				"avltree.ser"};
		korat.Korat.main(args);

		assertTrue(new File("avltree.ser").exists());

		Set<AvlTree> generatedTrees = readAvlTrees("avltree.ser");
		assertEquals(5, generatedTrees.size());

		for (AvlTree t : generatedTrees) {
			Integer originalSize = t.size();
			t.insert(0);
			assertEquals(originalSize + 1, t.size());
		}
	}

	private Set<AvlTree> readAvlTrees(String filename)
			throws IOException, FileNotFoundException, ClassNotFoundException {
		Set<AvlTree> generatedTrees = new HashSet<AvlTree>();
		File out = new File(filename);
		if (!out.exists()) {
			throw new FileNotFoundException();
		}
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(out));
		try {
			while (true) {
				try {
					AvlTree tree = (AvlTree) in.readObject();
					generatedTrees.add(tree);
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
