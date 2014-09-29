package com.algorithm.string;

import org.junit.Test;

public class ReverseWord {
	@Test
	public void testReverse() {
		String ss = "i am a student.";
		System.out.println(reverse(ss));
	}
	public String reverse(String sen) {
		String arr[] = sen.split(" ");
		StringBuilder sr = new StringBuilder();
		for (int i = arr.length -1; i >=0; i--) {
			sr.append(arr[i]).append(" ");
		}
		
		return sr.toString();
	}

}
