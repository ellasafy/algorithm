package com.algorithm.string;

import org.junit.Test;

public class StringToInt {
	@Test
	public void testStringToInt() {
		String val = "325";
		System.out.println(stringToInt(val));
	}
	/**
	 * 把字符串转换为整数
	 * 备注：char 跟 int 的ascii表相差48， (int)char - int = 48
	 * @param val
	 * @return
	 */
	public int stringToInt(String val) {
		int sum = 0;
		for (int i = val.length(); i > 0; i--) {
			int mul = 1;
			for (int j = 1; j < i; j++) {
				mul = mul * 10;
			}
			int v = (int)val.charAt(val.length() -i) - 48;
			sum = sum +  v*mul;
		}
		
		return sum;
	}

}
