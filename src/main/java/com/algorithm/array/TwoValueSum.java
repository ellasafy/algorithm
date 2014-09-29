package com.algorithm.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TwoValueSum {
	
	@Test
	public void testGetTotal() {
		int arr[] = new int[] {1,2,3,4,5,6};
		Map<Integer, Integer> maps = getTotal(arr, 6);
		
		Set<Map.Entry<Integer,Integer>> entry = maps.entrySet();
		for (Map.Entry<Integer,Integer> m : entry) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}
	/**
	 * 给定排序的数组，找出数组中的相加等于给定值value的两个数
	 * @return
	 */
	public Map<Integer, Integer> getTotal(int arr[], int value) {
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		
		int start = 0;
		int end = arr.length -1;
		while (start < end) {
			if ((arr[start] + arr[end]) == value) {
				maps.put(arr[start], arr[end]);
				start++;
				end--;
			}else if((arr[start] + arr[end]) < value){
				start++;
			} else {
				end--;
			}
		}
		
		return maps;
	}

}
