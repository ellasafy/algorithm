package com.algorithm.all;

import org.junit.Test;

public class Sum {

	/**
	 * 给定两个数n，m，从1,2,3..,n中找出所有值等于m的数（所有个数）
	 * @param n
	 * @param m
	 */
	public void printAllSum(int n, int m) {
		
	}
	

	@Test
	public void testJump1() {
		System.out.println(jump1(1));
		System.out.println(jump1(2));
		System.out.println(jump1(3));
		System.out.println(jump1(4));
		System.out.println(jump1(5));
	}
	/**
	 * 跳台阶问题，每次只能跳1，2
	 * f(n)，当1时，剩下的f(n-1)种，当2时，剩下的(n-2)种，一共f(n)=f(n-1) + f(n-2)
	 * @param n
	 * @return
	 */
	public int jump1(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		return jump1(n-1) + jump1(n-2);
		
	}
	
	@Test
	public void testJump() {
		System.out.println(Jump(2));
		System.out.println(Jump(3));
		System.out.println(Jump(4));
		System.out.println(Jump(5));
	}
	
	/**
	 * 跳台阶问题
	 * 当n = 1 时， 只有一种跳法，即1阶跳：Fib(1) = 1;
       当n = 2 时， 有两种跳的方式，一阶跳和二阶跳：Fib(2) = Fib(1) + Fib(0) = 2;
       当n = 3 时，有三种跳的方式，第一次跳出一阶后，后面还有Fib(3-1)中跳法； 第一次跳出二阶后，后面还有Fib(3-2)中跳法；第一次跳出三阶后，后面还有Fib(3-3)中跳法
        Fib(3) = Fib(2) + Fib(1)+Fib(0)=4;
	 * @param n
	 * @return
	 */
	public int Jump(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return Jump(n-1) + Jump(n-1);
	}
}
