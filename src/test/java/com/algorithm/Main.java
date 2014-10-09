package com.algorithm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String orignalString = in.nextLine();
		String removeString = in.nextLine();
		in.close();
		System.out.println(removeSpecificChars(orignalString, removeString));
	}

	public static String removeSpecificChars(String original, String remove) {
		char[] orgchararray = original.toCharArray();
		char[] removechararray = remove.toCharArray();
		int start, end = 0;
		// set the temp as the ASCII size
		boolean[] tempBoolean = new boolean[128];

		// set the remove asscii code in temp as false
		for (start = 0; start < removechararray.length; ++start) {
			tempBoolean[removechararray[start]] = true;
		}

		for (start = 0; start < orgchararray.length; ++start) {
			if (!tempBoolean[orgchararray[start]]) {
				orgchararray[end++] = orgchararray[start];
			}
		}

		return new String(orgchararray, 0, end);
	}
}
