package com.algorithm.stack;

public class OrderStack {
	
	public boolean isOderStack(MyStack origin, MyStack order) {
		
		MyStack tmp = new MyStack();
		boolean flag = false;
		while (!origin.isEmpty()) {
			int va = origin.peek();
			
			if (!tmp.isEmpty()) {
				
			}else {
				int t = order.pop();
				tmp.push(t);
			}
		}
		
		return flag;
	}

}
