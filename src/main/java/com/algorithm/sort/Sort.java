package com.algorithm.sort;

public class Sort {
	public static void main(String[] args) {
		int[] a = {22,2,5,8,11,3};
		int[] b = selectSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]  + " ");
		}
		
		
	}
	
	public static int[] bubleSort(int[] a) {
		int len = a.length;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i -1 ; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j +1];
					a[j +1] = tmp;
				}
			}
		}
		return a;
	}
	
	public static int[] selectSort(int[] a) {
		int len = a.length;
		int min = 0;
		for (int i = 0; i < len; i++) {
			min = i;
			for (int j = i +1; j < len; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			
			if (min != i) {
				int tmp = a[min];
				a[min] = a[i];
				a[i] = tmp;
			}
			
		}
		return a;
	}

}
