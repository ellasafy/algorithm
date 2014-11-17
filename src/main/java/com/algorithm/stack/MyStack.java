package com.algorithm.stack;

import org.junit.Test;

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

	
	@Test
	public void testReverse() {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		reverse(stack);
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
	/**
	 * 颠倒一个stack
	 * @param stack
	 */
	public void reverse(MyStack stack) {
		if (stack.isEmpty()) {
			return;
		}
		
		int va = stack.pop();
		reverse(stack);
		addPotToBottom(stack, va);
		
	}
	
	public void addPotToBottom(MyStack stack, int va) {
		if (stack.isEmpty()) {
			stack.push(va);
		}else {
			int v = stack.pop();
			addPotToBottom(stack, va);
			stack.push(v);
		}
	}

}
