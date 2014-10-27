package com.algorithm.sort;

import org.junit.Test;

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
	
	@Test
	public void testInsertSort() {
		int a[] = new int[] {5,2,4,6,1,3};
		insertSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public int[] insertSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int j = i -1;
			int key = a[i];
			while (j >=0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		
		return a;
	}
	
	@Test
	public void testQuickSort() {
		int[] arr = new int[] {2,1,5,8,7,6};
		quicksort(arr, 0, arr.length -1);
		
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void  quicksort(int[] arr, int low, int end) {
		int mid = (low + end)/2;
		
		int i = low;
		int j = end;
		
		while(i <=j) {
			
			while(arr[i] < arr[mid]) {
				i++;
			}
			while(arr[j] > arr[mid]) {
				j--;
			}
			
			if (i <= j) {
				int tmp = arr[i];
				arr[i]  = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		
		if (low < j) {
			quicksort(arr,low, j);
		}
		if (i < end) {
			quicksort(arr, i, end);
		}
	}
	
    public void mergeSort(int[] a, int low, int height) {
    	
    }
    
    public void merge(int[] a, int low, int mid, int height) {
    	int[] tmp = new int[height - low +1];
    	
    	int i = low;
    	int j = mid ;
    	
//    	while (i <)
    	
    }

}
