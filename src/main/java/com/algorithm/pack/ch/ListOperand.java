package com.algorithm.pack.ch;

import org.junit.Test;

public class ListOperand {
    int index = 0;
	@Test
	public void testCase() {
		int a[] = new int[] {1,3,5,5};
		int b[] = new int[] {1,2,5,5};
		int c[] = merageSame(a,b);
		for (int i = 0; i < index ; i++) {
			System.out.print(c[i] + " ");
		}
		
		System.out.println("");
		c = mergeAll(a,b);
		for (int i = 0; i < index ; i++) {
			System.out.print(c[i] + " ");
		}
	}
	/*
	 *合并两个排序列表的相同元素 
	 */
	public int[] merageSame(int a[], int b[]) {
		int i = 0;
		int j = 0;
		index = 0;
		int c[] = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				i++;
			}else if (a[i] > b[j]) {
				j++;
			}else {
				c[index++] = a[i];
				i++;
				j++;
			}
		}
		return c;
	}
	
	/**
	 * a,b两个数组的交集
	 * @param a
	 * @param b
	 * @return
	 */
	public int[] mergeAll(int a[], int b[]) {
		int i = 0;
		int j = 0;
		index = 0;
		int c[] = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				if (index !=0 &&a[i] != c[index -1]) {
					c[index++]
				}
				i++;
			} else if (a[i] > b[j]) {
				c[index++] = b[j];
				j++;
			}else {
				c[index++] = a[i];
				i++;
				j++;
			}
		}
		return c;
	}
}
