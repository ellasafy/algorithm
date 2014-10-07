package com.algorithm.string;

import org.junit.Test;

public class LeftRotateString {
	
	@Test
	public void testLeftRotate() {
		String str = "abcdef";
		System.out.println(leftRotate(str, 1));
		System.out.println(leftRotate(str, 2));
		System.out.println(leftRotate(str, 3));
		System.out.println(leftRotate(str, 4));
	}
	/**
	 * 定义字符串的左旋转操作：把字符串前面的若干个字符移动到字符串的尾部。
     *   如把字符串abcdef左旋转2位得到字符串cdefab。请实现字符串左旋转的函数。
                  要求时间对长度为n的字符串操作的复杂度为O(n)，辅助内存为O(1)。
	 * @param str
	 * @param n
	 * @return
	 */
	public String leftRotate(String str, int n) {
		for (int i = 0; i < n; i++) {
			str = str.substring(1) + str.charAt(0);
		}
		
		return str;
	}

}
