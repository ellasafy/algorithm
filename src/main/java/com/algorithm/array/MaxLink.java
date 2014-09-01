package com.algorithm.array;


public class MaxLink {
	
	public static void main(String[] args) {
		int[] a= {1, 3, -2, 4, -5};
	    int c= max(a);
	    System.out.println(c);
	    
	    int[] b = {-4,2, -5, 1};
	    System.out.println(max(b));
	}
	/**
	 * 最大连续子序列
	 * @param a
	 * @return
	 */
	public static int max(int[] a) {
		int sum = a[0];
	    int max = a[0];
		for (int j = 1; j < a.length; j++) {
			if (sum < 0) {
				sum = a[j];
			} else {
				sum = sum + a[j];
			}
			if (sum > max){
				max =sum;
			}
		}
		return max;
	}

}
