package com.algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		String orignalString = in.nextLine();
		String removeString = in.nextLine();
		in.close();
		
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

}
