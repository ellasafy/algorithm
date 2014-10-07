package com.algorithm.string;

import org.junit.Test;

public class MaxLenInt {
	
	@Test
	public void testMaxLen() {
		String st = "abcd12345ed125ss123456789";
		maxLen(st.toCharArray());
	}
	
	/**
	 * 写一个函数,它的原形是int continumax(char *outputstr,char *intputstr)
功能：
在字符串中找出连续最长的数字串，并把这个串的长度返回，
并把这个最长数字串付给其中一个函数参数outputstr所指内存。
例如："abcd12345ed125ss123456789"的首地址传给intputstr后，函数将返回9，
outputstr所指的值为123456789
	 * @param str
	 */
	public void maxLen(char[] str) {
		int start = 0, end = 0, max = 0;
		int maxStart = 0, maxEnd = 0;
		for (int i = 0; i < str.length; i++) {
			//ascii 中间0 - 9的数字
			if ( '0' <= str[i] && str[i] <= '9') {
				end = i;
				if (end - start > max) {
					maxStart = start;
					maxEnd = end;
					max = end - start;
				}
			} else {
				start = i;
				end = i;
				
			}
		}
		
		System.out.println("max : " + max + " : " + maxStart+ "  " + maxEnd);
		
		for (int i = maxStart + 1; i <= maxEnd; i++) {
			System.out.print(str[i] + " ");
		}
	}

}
