package com.algorithm.stack;

public class MyStack {
	private static final int MAX = 100;
	private int[] elem = new int[MAX];
	private int index = 0;
	
	public void push(int n) {
		if (index >= MAX) {
			throw new IllegalArgumentException();
		}
		else {
			elem[index++] = n;
		}
	}
	
	public int peek() {
		if (index == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		else {
			return elem[index -1];
		}
	}
	
	public int pop() {
		if (index == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		else {
			return elem[index-- -1];
		}
	}
	
	public boolean isEmpty() {
		return index == 0? true:false;
	}

}
