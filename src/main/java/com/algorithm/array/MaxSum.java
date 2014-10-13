package com.algorithm.array;

import org.junit.Test;

/**
 * 计算一个数组最大连续数，复杂度O(n)
 * @author ellasafy
 *
 */
public class MaxSum {

	public static void main(String[] args) {
		MaxSum sum = new MaxSum();
	   int arr[] = new int[]{-2,3,-5,7,-2,-5};
	   System.out.println(sum.max(arr));
	   
	   int arr2[] = new int[]{-2,-3,-5,-7};
	   System.out.println(sum.max(arr2));
	}
	
	public int max(int arr[]) {
		int maxsum = arr[0];
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			if (sum < 0) {
				sum = arr[i];
			}else {
				sum = sum + arr[i];
			}
			
			if (maxsum < sum) {
				maxsum = sum;
			}
			
		}
		return maxsum;
	}
	
	@Test
	public void testMaxSub() {
		int[] a = new int[]{9,4,3,2,5,4,3,2};
		maxSub(a);
				
	}
	/**
	 * 求一个数组的最长递减子序列 比如{9，4，3，2，5，4，3，2}的最长递减子序列为{9，5，4，3，2}
	 * @param a
	 */
	public void maxSub(int[] a) {
		int start1 =0, start2 = 0;
		int end1 = 0, end2 = 0;
		int sum1 =1, sum2 = 1;
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i-1]) {
				end2 = i;
				sum2 = sum2 +1;
				if (sum2 > sum1) {
					start1 = start2;
					end1 = end2;
					sum1 = sum2;
				}
			}else {
				start2 = i;
				end2 = i;
				sum2 = 1;
			}
		}
		
		for (int i = start1; i <= end1; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
}
