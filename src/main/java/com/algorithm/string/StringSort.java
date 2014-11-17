package com.algorithm.string;

import org.junit.Test;

public class StringSort {
	@Test
	public void testAllSort() {
		String ss = "abc";
		char[] origin = ss.toCharArray();
		allSort(origin, "", +origin.length);
	}

	/**
	 * ：输入一个字符串，打印出该字符串中字符的所有排列。
	 *  例如输入字符串abc，则输出由字符a、b、c所能排列出来的所有字符串
	 * abc、acb、bac、bca、cab和cba。
	 * 
	 * @param origin
	 * @param p
	 * @param n
	 */
	public void allSort(char[] origin, String p, int n) {
		if (n == 1) {
			System.out.println(p + origin[0]);
		}

		for (int i = 0; i < n; i++) {
			char[] tmp = new char[n - 1];
			int index = 0;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					tmp[index++] = origin[j];
				}
			}
			allSort(tmp, p + origin[i], n - 1);
		}

	}
	
	/**
	 * ：输入一个字符串，打印出该字符串中字符的所有排列。
	 *  例如输入字符串abc，则输出由字符a、b、c所能排列出来的所有字符串
	 * abc、acb、bac、bca、cab和cba。
	 * 
	 * @param origin
	 * @param p
	 * @param n
	 */
	public void printAll(String s, String pre) {
		if (s.length()==0) {
			System.out.print(pre + s + " ");
			return;
		}
		for (int i=0;i <s.length();i++) {
			char ch = s.charAt(i);
			String s2 = s.substring(0,i) + s.substring(i+1);
			printAll(s2, pre+ch);
		}
	}

}
