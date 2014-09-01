package com.algorithm.array;

public class MergeArray {
	
	public static void main(String[] args) {
		int[] a= {1,3,4,7,9};
		int[] b = {3,5,8};
		MergeArray arr = new MergeArray();
		
		int[] c = arr.merge(a, b);
		for (int i =0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
	
	public int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		
		int i =0;
		int j = 0;
		int index = 0;
		
		while(i < a.length  && j < b.length) {
			if (a[i] > b[j]) {
				c[index] = b[j];
				j++;
			} else {
				c[index] = a[i];
				i++;
			}
			
			index++;
		}
		
		if (i > a.length -1 && j < b.length) {
			for (;j <=b.length -1; j++) {
				c[index] = b[j];
				index++;
			}
		}
		if (j > b.length-1 && i < a.length) {
			for (; i <=a.length -1 ; i++) {
				c[index] =a[i];
				index++;
			}
		}
		return c;
	}

}
