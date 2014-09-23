package com.algorithm.all;

import com.algorithm.tree.BinaryTree;

public class TreeToLink {
	private static LinkFromTree tmp;
	public static void main(String[] args) {
		BinaryTree trr= com.algorithm.tree.BinaryTree.build();
		LinkFromTree link = new LinkFromTree();
		midleVisit(trr, link);
		while(tmp.pre!=null) {
			tmp = tmp.pre;
		}
	    while(tmp != null) {
	    	System.out.print(" " + tmp.value);
	    	tmp = tmp.next;
	    }
	}
	
	public static void midleVisit(BinaryTree tree, LinkFromTree link) {

		if (tree.left != null) {
			midleVisit(tree.left, link);
		}
		LinkFromTree next = new LinkFromTree();
		if (tmp != null) {
			tmp.next = next;
			next.pre = tmp;
		}
		
		tmp = next;
		next.value = tree.value;
		
		if (tree.right != null) {
		
			midleVisit(tree.right, link);
		}
		
	}
	
	static class LinkFromTree {
		public int value;
		public LinkFromTree next = null;
		public LinkFromTree pre = null;
	}
	

}
