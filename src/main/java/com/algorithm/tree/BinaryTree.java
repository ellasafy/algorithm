package com.algorithm.tree;

public class BinaryTree {
	public int value;
	public BinaryTree left = null;
	public BinaryTree right = null;
	public static void main(String[] args) {
	   BinaryTree tree1 = build();	
	   preVisit(tree1);
	   
	}
	
	
	public static BinaryTree build() {
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
		
		BinaryTree left21 = new BinaryTree();
		BinaryTree right22 = new BinaryTree();
		
		left21.value = 6;
		right22.value = 7;
		right1.left = left21;
		right1.right = right22;
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

}
