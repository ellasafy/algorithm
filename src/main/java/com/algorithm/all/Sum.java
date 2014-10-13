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
	
	@Test
	public void testBinarySum() {
		System.out.println(Integer.toBinaryString(1));
		System.out.println(binarySum(1));
		System.out.println(Integer.toBinaryString(2));
		System.out.println(binarySum(2));
		System.out.println(Integer.toBinaryString(3));
		System.out.println(binarySum(3));
		System.out.println(Integer.toBinaryString(33));
		System.out.println(binarySum(33));
		System.out.println(Integer.toBinaryString(333));
		System.out.println(binarySum(333));
	}
	/*int 数种binary字符1的个数
	 * 
	 */
	public int binarySum(int n) {
		int sum = 0;
		while(n>0) {
			if ((n & 1) == 1) {
				sum = sum +1;
			}
			n = n >>1;
		}
		return sum;
	}
	
	@Test
	public void testDecimalSum() {
		System.out.println(decimalSum(1));
		System.out.println(decimalSum(5));
		System.out.println(decimalSum(12));
	}
	
	/**
	 * ：输入一个整数n，求从1到n这n个整数的十进制表示中1出现的次数。
         例如输入12，从1到12这些整数中包含1 的数字有1，10，11和12，1一共出现了5次。
	 * @param n
	 * @return
	 */
	public int decimalSum(int n) {
	    StringBuilder s = new StringBuilder();
	    for (int i = 1; i <=n; i++) {
	    	s.append(i);
	    }
	    String ss = s.toString();
	    
	    System.out.println(ss);
	    int sum = 0;
	    for (int i = 0; i < ss.length(); i++) {
	    	int ii= Integer.valueOf(ss.charAt(i) - 48);
	    	if ( ii== 1) {
	    		sum = sum +1;
	    	}
	    }
	    return sum;
	}
	@Test
	public void testContinueSum() {
		continueSum(15);
	}
	/**
	 * 输入一个正数n，输出所有和为n连续正数序列。
                例如输入15，由于1+2+3+4+5=4+5+6=7+8=15，所以输出3个连续序列1-5、4-6和7-8。
              设起始数为x，共i个数相加，序列x + (x+1) + (x+2) + ...+ (x + i -1) = N
               解为：x*i = N - ((i*(i-1))/2;
	 * @param n
	 * @return
	 */
	public void continueSum(int n) {
		for (int i = 2;  i < n; i++) {
			int x = (2*n - i*i +i)/(2*i);
			int x2 = (2*n - i*i +i)%(2*i);
			if (x >0 && x2 ==0) {
				
			
			for (int j = 0; j < i; j++) {
				System.out.print(x+j + " ");
			}
			System.out.println("");
			}
		}
	}
}



