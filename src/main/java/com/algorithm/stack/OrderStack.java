package com.algorithm.stack;

import org.junit.Test;

public class OrderStack {
	@Test
	public void testIsOrderStack() {
		//1,2,3,4,5
		MyStack origin = new MyStack();
		origin.push(1);
		origin.push(2);
		origin.push(3);
		origin.push(4);
		origin.push(5);
		//4,5,3,2,1,可能的pop序列
		MyStack order = new MyStack();
		order.push(4);
		order.push(5);
		order.push(3);
		order.push(2);
		order.push(1);
		
		System.out.println(isOderStack(origin, order));
		
		MyStack origin2 = new MyStack();
		origin2.push(1);
		origin2.push(2);
		origin2.push(3);
		origin2.push(4);
		origin2.push(5);
		//4,5,3,2,1,可能的pop序列
		MyStack order2 = new MyStack();
		order2.push(4);
		order2.push(5);
		order2.push(3);
		order2.push(1);
		order2.push(2);
		
		System.out.println(isOderStack(origin2, order2));
	}
	/**
	 * 更定序列a,b，判断b是否可能是a的pop序列
	 * 如1，2，3，4，5   4，5，3，2，1是不是可能的序列
	 * @param origin
	 * @param order
	 * @return
	 */
	public boolean isOderStack(MyStack origin, MyStack order) {
		
		MyStack tmp = new MyStack();
		boolean flag = false;
		while (!origin.isEmpty()) {
			//从原始stack获取最上面的元素
			int va = origin.peek();
			
			if (!tmp.isEmpty()) {
				//去除tmp中最上面的比较
				int vb = tmp.peek();
				if (vb == va) {
					tmp.pop();
					origin.pop();
				//不相等接着取order的另一个元素放入tmp
				}else {
	                //order取没了，但是还不相等，说明不是一个序列，停止
					if (order.isEmpty()) {
						break;
					}else {
						tmp.push(order.pop());
					}
				}
			}else {
				
				int t = order.pop();
				tmp.push(t);
			}
		}
		if (origin.isEmpty()) {
			flag= true;
		}
		return flag;
	}

}
