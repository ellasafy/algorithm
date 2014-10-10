package com.algorithm.all;

import java.util.Scanner;

public class Tower {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[][][][] tower = new int[1000][1000][1000][3];
		for (int i = 0; i < n; i++) {
			tower[0][0][0][i] = 1;
		}
		
		
	}

}
