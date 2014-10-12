package com.algorithm.stack;

import org.junit.Test;

/**
 * 两个stack实现一个queue
 * @author ellsasa
 *
 */
public class QueueByStack {
	private MyStack origin = new MyStack();
	private MyStack tmp = new MyStack();
	
	@Test
	public void test() {
		QueueByStack queue = new QueueByStack();
		queue.in(1);;
		queue.in(2);;
		queue.in(3);
		
		System.out.println(queue.out());
		System.out.println(queue.out());
		System.out.println(queue.out());
	}
	
	
	public void in(int n) {
		origin.push(n);
	}
	
	public int out() {
		
		while (!origin.isEmpty()) {
			int va = origin.pop();
			if (origin.isEmpty()) {
				change(origin, tmp);
				return va;
			}else {
				tmp.push(va);
			}
		}
		
		throw new ArrayIndexOutOfBoundsException();
	}
	
	private void change(MyStack origin, MyStack tmp) {
		while (!tmp.isEmpty()) {
			origin.push(tmp.pop());
		}
	}

}
