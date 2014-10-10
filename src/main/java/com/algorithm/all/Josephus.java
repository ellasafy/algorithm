package com.algorithm.all;

import java.util.ArrayList;
import java.util.Scanner;

public class Josephus {
	
    public static int execute(int n, int k){
        int killIdx = 0;
        ArrayList<Integer> prisoners = new ArrayList<Integer>(n);
        for(int i = 0;i < n;i++){
            prisoners.add(i);
        }
        while(prisoners.size() > 1){
            killIdx = (killIdx + k - 1) % prisoners.size();
            prisoners.remove(killIdx);
        }
        return prisoners.get(0);
    }
 
 
    public static void main(String[] args) throws Exception{
    	Scanner in = new Scanner(System.in);
    	int len = in.nextInt();
    	in.close();
    	if (len <=0) {
    		throw new IllegalArgumentException();
    	}
        System.out.print(execute(len, 3));
    }
}
