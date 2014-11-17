package com.algorithm.array;

import org.junit.Test;

public class ArrayMain {
	
	@Test
	public void testLeatestNum() {
		int arr[] = new int[] {3,4,5,1,2};
		System.out.println(leatestNun(arr));
		int ar2r[] = new int[] {2,3,4,5,1};
		System.out.println(leatestNun(ar2r));
		int ar3[] = new int[] {1,2,3,4,5};
		System.out.println(leatestNun(ar3));
	}
	/**
	 * 旋转数组中的最小元素（数组、算法）。
题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个排好序的数组的一个旋转，
输出旋转数组的最小元素。例如数组{3, 4, 5, 1, 2}为{1, 2, 3, 4, 5}的一个旋转，该数组的最小值为1。
	 * @param arr
	 * @return
	 */
	public int leatestNun(int arr[]) {
		int i = 0;
		int j = arr.length -1;
		int flag = arr[0];
		while(i<arr.length && arr[i] >= flag) {
			i++;
		}
		if (i == arr.length) {
			return arr[0];
		}
		return arr[i];
	}
	
	@Test
	public void testFindInt() {
		int[] arr = new int[] {1,2,5,7,9,5,5,9,5,2,5,4,5,6,5,5,5,5,5};
		System.out.println(findInt(arr));
	}
	
	public int findInt(int arr[]) {
		int[] flag = new int[128];
		int num = arr[0];
		for (int i = 0;i<arr.length;i++) {
			flag[arr[i]]++;
		}
		for (int i = 0;i < arr.length; i++) {
			if (flag[arr[i]] > arr.length/2) {
				num= arr[i];
				break;
			}
		}
		return num;
	}

}
