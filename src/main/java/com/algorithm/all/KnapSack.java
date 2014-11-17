package com.algorithm.all;

import org.junit.Test;

import com.algorithm.tree.BinaryTree;

public class KnapSack {
	@Test
	public void testKnapSack() {
		int val[] = {60, 100, 120};
	    int wt[] = {10, 20, 30};
	    int  W = 50;
	    System.out.println(knapSack(W, wt, val, wt.length));
	}
	
	
	public int max(int a, int b) {
		return a> b? a:b;
	}
	
	public int knapSack(int W, int[] wt, int[] value, int n) {
		if (n == 0 || W== 0) {
			return 0;
		}
		
		//当前数值不合适，剔除，寻找后面的
		if (wt[n-1] > W) {
			return knapSack(W, wt, value, n-1);
		}
		//n包含 + n不包含，两种情况
		return max(value[n-1] + knapSack(W-wt[n-1], wt, value, n-1),
				knapSack(W,wt, value, n-1));
		
	}

}
