package org.autotest;

import java.util.ArrayList;

public class StackAr {

	private final static int DEFAULT_CAPACITY = 10;

	private final ArrayList<StackIn> elems;

	private Object top;

	public StackAr() {
		this(DEFAULT_CAPACITY);
	}

	public StackAr(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException();
		}

		elems = new ArrayList();
		elems.add(new StackIn(capacity));
	}

	public int size() {
		int size = 0;

		for (StackIn stack : elems) {
			size += stack.size();
		}

		return size;
	}

	public boolean isFull() {
		boolean isFull = true;

		for (StackIn stack : elems) {
			isFull &= stack.isFull();
		}

		return isFull;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void push(Object o) throws IllegalStateException {
		if (isFull()) {
			throw new IllegalStateException();
		}

		int i=0;
		StackIn s = elems.get(i);

		while(s.isFull()) {
			i++;
			s = elems.get(i);
		}

		s.push(o);
		this.top = o;
	}

	public Object pop() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException();
		}

		int i = 0;
		StackIn s;

		//find first not fulled stack
		do {
			s = elems.get(i);
			i++;
		} while (s.isFull() && i<elems.size());

		if (i == elems.size()) i--;

		//check if it has at least one element
		if (s.size() == 0) {
			s = elems.get(i-1);
			i--;
		}

		Object popped = s.pop();

		//Update top attribute
		if (this.isEmpty()) {
			this.top = null;
		} else if (s.isEmpty()) {
			StackIn lklk = elems.get(i-1);
			this.top = lklk.top();
		} else {
			this.top = s.top();
		}

		return popped;
	}

	public Object top() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException();
		}

		return top;
	}

	public Object get(int index) throws IllegalArgumentException {
		if (index < 0)
			throw new IllegalArgumentException();

		if (index > this.size())
			throw new IllegalArgumentException();

		Object o = null;
		for (StackIn s : elems) {
			if (index >= s.size()) {
				index -= s.size();
			} else {
				o = s.get(index);
			}
		}

		return o;
	}

	public void increaseCapacity(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException();
		}

		elems.add(new StackIn(capacity));
	}

	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("[");

		for (StackIn s : elems) {
			b.append( s.toString() + "," );
		}

		if (this.size() > 0) b.deleteCharAt(b.length() - 1);

		b.append("]");
		return b.toString();
	}

	private class StackIn {
		private final Object[] elems;

		private int readIndex = -1;

		public StackIn(int capacity) throws IllegalArgumentException {
			this.elems = new Object[capacity];
		}

		public int size() {
			return readIndex+1;
		}

		public boolean isEmpty() {
			return size() == 0;
		}

		public boolean isFull() {
			return size() == elems.length;
		}

		public void push(Object o) throws IllegalStateException {
			this.readIndex++;
			this.elems[readIndex] = o;
		}

		public Object pop() throws IllegalStateException {
			Object rv = this.top();
			this.elems[readIndex] = null;
			readIndex--;
			return rv;
		}

		public Object top() throws IllegalStateException {
			Object rv = this.elems[readIndex];
			return rv;
		}

		public Object get(int index) throws IllegalArgumentException {
			Object rv = this.elems[index];
			return rv;
		}

		@Override
		public String toString() {
			StringBuffer b = new StringBuffer();
			int i = 0;
			while (i<=readIndex) {
				if (i > 0) {
					b.append(",");
				}
				Object o = elems[i];
				String s = String.valueOf(o);
				b.append(s);
				i++;
			}
			return b.toString();
		}
	}
}