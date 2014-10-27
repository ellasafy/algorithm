package com.algorithm;

import org.junit.Test;

public class Sort {
	int a[] = new int[] {3,5,2,1,7,8,4};
	
	public void print(int a[]) {
		for (int i =0; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	@Test
    public void testQuickSort() {
		System.out.println("sss");
    
    	quickSort(a, 0, a.length -1);
    	for (int i = 0; i < a.length; i++) {
    		System.out.print(a[i] + " ");
    	}
    }
	public void quickSort(int[] a, int low, int height) {
		int mid = (low + height)/2;
		
		int i = low;
		int j = height;
		
		while (i <= j) {
			while(a[i] < a[mid]) {
				i++;
			}
			while(a[j] > a[mid]) {
				j--;
			}
			
			if (i <= j) {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;
				j--;
			}
		}
		
		if (low < j) {
			quickSort(a, low, j);
		}
		if (height > i) {
			quickSort(a, i, height);
		}
	}
	
	@Test
	public void testSelectSort() {
		selectSort(a);
		print(a);
	}
	public void selectSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			
			int tmp = a[min];
			a[min] = a[i];
			a[i] = tmp;
		}
	}
	
	@Test
	public void testBubleSort() {
		bubleSort(a);
		print(a);
	}
	public void bubleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}
		}
	}
	
	@Test
	public void testInsertSort() {
		insertSort(a);
		print(a);
	}
	
	public void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = i -1;
			int key = a[i];
			while (j >=0 && a[j] > key) {
				a[j + 1]= a[j];
				j--;
			}
			a[j+1] = key;
		}
	}

}
