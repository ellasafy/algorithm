package com.algorithm.string;

import org.junit.Test;

public class StringAll {

	@Test
	public void testSumOfChar() {
		String a = "abababccccc";
		String b = "abc";

		sumOfChar(a, b);
	}

	/**
	 * 给定两个字符串，a，b，求a中b出现次数
	 * 
	 * @param orgin
	 * @param test
	 */
	public void sumOfChar(String orgin, String test) {
		char[] orginChar = orgin.toCharArray();
		char[] testChar = test.toCharArray();

		boolean tmp[] = new boolean[128];

		for (int i = 0; i < testChar.length; i++) {
			tmp[testChar[i]] = true;
			System.out.println(testChar[i]);
		}

		int[] sum = new int[128];

		// Map<String, Integer> mp = new HashMap<String, Integer>();
		for (int i = 0; i < orginChar.length; i++) {
			if (tmp[orginChar[i]]) {
				sum[orginChar[i]]++;
			}
		}

		for (int i = 0; i < testChar.length; i++) {
			if (sum[testChar[i]] > 0) {
				System.out.println(testChar[i] + " : " + sum[testChar[i]]);
			}
		}

	}

	@Test
	public void testFindElem() {
		String ss = "abcaefflf";
		findElem(ss);
		System.out.println("");
		String sss = "abcaefflfeeecceee";
		findElem(sss);
	}

	/**
	 * a~z包括大小写与0~9组成的N个数 用最快的方式把其中重复的元素挑出来。
	 * 
	 * @param s
	 */
	public void findElem(String s) {
		char[] ss = s.toCharArray();
		int[] tmp = new int[128];
		for (int i = 0; i < ss.length; i++) {
			if (tmp[ss[i]] == 1) {
				System.out.print(ss[i] + " ");
				tmp[ss[i]]++;
			} else {
				tmp[ss[i]]++;
			}
		}
	}

}
