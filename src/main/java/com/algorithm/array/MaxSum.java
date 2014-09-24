package com.algorithm.array;

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
	
}
