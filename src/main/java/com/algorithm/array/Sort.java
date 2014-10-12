package com.algorithm.array;

import org.junit.Test;

public class Sort {
	@Test
	public void testSortEvenOdd() {
		int[] a = new int[] { 4, 2, 3, 4, 5 };
		sortEvenOdd(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/**
	 * 输入一个整数数组，调整数组中数字的顺序，使得所有奇数位于数组的前半部分，
	 *  所有偶数位于数组的后半部分。要求时间复杂度为O(n)。
	 * 
	 * @param a
	 */
	public void sortEvenOdd(int[] a) {
		int even = -1;
		int odd = -1;
		for (int i = 0; i < a.length; i++) {
			int tmp = a[i];
			if (tmp % 2 == 1) {
				odd = i;
				if (even != -1) {
					a[odd] = a[even];
					a[even] = tmp;
					even++;
				}
			} else {
				if (even == -1) {
					even = i;
				}
			}
		}
	}

}
