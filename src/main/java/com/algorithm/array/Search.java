package com.algorithm.array;

import java.util.LinkedList;

public class Search {

	public void findchar(int[] a) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.size();
		int tmp = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[tmp]) {
				tmp = i +1;
			}
		}
	}
}
