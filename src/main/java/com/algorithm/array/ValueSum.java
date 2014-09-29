package com.algorithm.array;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ValueSum {
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());
	}
	public int[] sum(int arr[]) {
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i =0; i <arr.length; i++) {
			if (!mp.containsKey(arr[i])) {
				mp.put(arr[i], 1);
			} else {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			}
		}
		return new int[20];
	}

}
