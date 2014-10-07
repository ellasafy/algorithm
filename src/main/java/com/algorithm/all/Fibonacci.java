package com.algorithm.all;

import org.junit.Test;

public class Fibonacci {
	
	
	
	@Test
	public void testFibo() {
		System.out.println("");
		System.out.print(Fibo(0) + " ");
		System.out.print(Fibo(1) + " ");
		System.out.print(Fibo(2) + " ");
		System.out.print(Fibo(3) + " ");
		System.out.print(Fibo(4) + " ");
		System.out.print(Fibo(5) + " ");
		System.out.print(Fibo(6) + " ");
		System.out.print(Fibo(7) + " ");
		System.out.print(Fibo(8) + " ");
		System.out.print(Fibo(9) + " ");
	}
	/**
	 * O(n)算法
	 * @param n
	 * @return
	 */
	public int Fibo(int n) {
	
		
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		int tmp1 = 0;
		int tmp2 =1;
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			sum = tmp1 + tmp2;
			tmp1 = tmp2;
			tmp2 = sum;
		}
		
		return sum;
	}
	
	@Test
	public void testFibo2() {
		System.out.println("");
		System.out.print(Fibo2(0) + " ");
		System.out.print(Fibo2(1) + " ");
		System.out.print(Fibo2(2) + " ");
		System.out.print(Fibo2(3) + " ");
		System.out.print(Fibo2(4) + " ");
		System.out.print(Fibo2(5) + " ");
		System.out.print(Fibo2(6) + " ");
		System.out.print(Fibo2(7) + " ");
		System.out.print(Fibo2(8) + " ");
		System.out.print(Fibo2(9) + " ");
		
	}
	
	/**
	 * 递归方法
	 * @param n
	 * @return
	 */
	public int Fibo2(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		return Fibo2(n-1) +Fibo2(n -2);
	}

}
