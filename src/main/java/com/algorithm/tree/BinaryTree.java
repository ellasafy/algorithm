package com.algorithm.tree;

import org.junit.Test;

public class BinaryTree {
	public int value;
	public BinaryTree left = null;
	public BinaryTree right = null;
	public static void main(String[] args) {
//	   BinaryTree tree1 = build();	
//	   preVisit(tree1);
	   
	}
	
	
	public  BinaryTree build() {
		//1
		BinaryTree root = new BinaryTree();
		root.value = 1;
		//2
		BinaryTree left1 = new BinaryTree();
		BinaryTree right1 = new BinaryTree();
		left1.value = 2;
		right1.value = 3;
		root.left = left1;
		root.right = right1;
		//3
		BinaryTree left11 = new BinaryTree();
		BinaryTree right12 = new BinaryTree();
		left11.value = 4;
		right12.value = 5;
		left1.left = left11;
		left1.right = right12;
		
		BinaryTree left211 = new BinaryTree();
		left11.left = left211;
		left211.value = 3;
		
		BinaryTree left21 = new BinaryTree();
		BinaryTree right22 = new BinaryTree();
		
		left21.value = 6;
		right22.value = 7;
		right1.left = left21;
		right1.right = right22;
		
		System.out.println( "             1             " );
		System.out.println("          2       3          ");
		System.out.println("        4    5   6   7       ");
		//4
//		
//		BinaryTree left111 = new BinaryTree();
//		BinaryTree right112 = new BinaryTree();
//		left111.value = 8;
//		right112.value = 9;
//		left11.left = left111;
//		left11.right = right112;
//		
//		BinaryTree left121 = new BinaryTree();
//		BinaryTree right122 = new BinaryTree();
//		left121.value = 10;
//		right122.value = 11;
//		right12.left = left121;
//		right12.right = right122;
//		
//		BinaryTree left211 = new BinaryTree();
//		BinaryTree right212 = new BinaryTree();
//		left211.value = 10;
//		right212.value = 11;
//		left21.left = left211;
//		left21.right = right212;
//		
//		BinaryTree left221 = new BinaryTree();
//		BinaryTree right222 = new BinaryTree();
//		left221.value = 12;
//		right222.value = 13;
//		right22.left = left221;
//		right22.right = right222;
		return root;
	}
	static void preVisit(BinaryTree tree) {
		System.out.print(tree.value + " ");
		if (tree.left != null) {
			preVisit(tree.left);
		}
		if (tree.right != null) {
			preVisit(tree.right);	
		}

	}
	
	@Test
	public void testMacDepth() {
		BinaryTree tree = build();
		System.out.print(maxDepth(tree));
	    
	}
	public int maxDepth(BinaryTree tree) {
		if (tree == null) {
			return 0;
		}
		int lDepth = maxDepth(tree.left);
		int rDepth = maxDepth(tree.right);
		
		if (lDepth > rDepth) {
			return lDepth +1;
		} else {
			return rDepth +1;
		}
	}
	
	@Test
	public void testAllPath() {
		BinaryTree tree = build();
		int path[] = new int[10];
		int len = 0;
	    printAllPath(tree, path, len);
	    
	}
	
	/**
	 * 打印一个二叉树所有的路径
	 * @param tree
	 * @param path
	 * @param len
	 */
	public void printAllPath(BinaryTree tree, int path[], int len) {
		if (tree == null) {
			return;
		}
		path[len++] = tree.value;
		
		if (tree.left == null && tree.right == null) {
			System.out.println("get a path");
			for (int i = 0; i < len; i++) {
				System.out.print(path[i] + " ");
			}
			System.out.println("");
		} else {
			printAllPath(tree.left, path, len);
			printAllPath(tree.right, path, len);
		}
	}
	
	@Test
	public void testAllPathSum() {
		BinaryTree tree = build();
		System.out.println(allPathSum(tree));
	    
	}
	/**
	 * 计算一个二叉树有多少个路径
	 * @param tree
	 * @param sum
	 */
	int sum =0;
	public int allPathSum(BinaryTree tree) {
	    if (tree == null) {
	    	return 0;
	    }
	    if (tree.left == null && tree.right == null) {
	    	sum = sum +1;
	    } else {
	    	allPathSum(tree.left);
	    	allPathSum(tree.right);
	    }
	    return sum;
	}
	
	@Test
	public void testPrintPathSumToGivenValue() {
		System.out.println("====================================");
		BinaryTree tree = build();
		int path[] = new int[10];
		int len = 0;
		int sum = 0;
		printPathSumToGivenValue(tree, path, len, sum, 10);
	}
	
	/**
	 * 二叉树的所有路径 中的和等于给定的数
	 * @param tree
	 * @param path
	 * @param len
	 * @param sum
	 * @param value
	 */
	public void printPathSumToGivenValue(BinaryTree tree, int path[], int len, int sum, int value) {
		if (tree == null) {
			return;
		}
		path[len++] = tree.value;
		sum = sum + tree.value;
		if (tree.left == null && tree.right == null && sum == value)  {
			System.out.println("get a path");
			for (int i = 0; i < len; i++) {
				System.out.print(path[i] + " ");
			}
			System.out.println("");
		}else {
			printPathSumToGivenValue(tree.left, path,len, sum, value);
			
			printPathSumToGivenValue(tree.right, path,len, sum, value);
		}
		
	}

}
