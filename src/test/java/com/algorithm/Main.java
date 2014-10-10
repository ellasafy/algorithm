package com.algorithm;

import java.util.Scanner;

public class Main {
<<<<<<< HEAD
	public static void main(String[] args) {
=======

	public static void main(String[] args) throws Exception{
>>>>>>> 54e897b536be64827ac84ab43c9d396e727c5785
		Scanner in = new Scanner(System.in);
		String orignalString = in.nextLine();
		String removeString = in.nextLine();
		in.close();
<<<<<<< HEAD
		String t = removeSpecificChars(orignalString, removeString);
		System.out.println(t);
		System.out.print(t);
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
=======
		
		char[] orgchar = orignalString.toCharArray();
		char[] removechar = removeString.toCharArray();
		int start = 0;
		boolean[] temp = new boolean[65536];


		for (start = 0; start < removechar.length; ++start) {
			temp[removechar[start]] = true;
		}

        int index = 0;
		for (start = 0; start < orgchar.length; ++start) {
			if (!temp[orgchar[start]]) {
				orgchar[index++] = orgchar[start];
			}
		}
		System.out.print(new String(orgchar, 0, index));

	}

>>>>>>> 54e897b536be64827ac84ab43c9d396e727c5785
}
