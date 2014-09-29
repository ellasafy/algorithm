package com.algorithm.list;

import org.junit.Test;

/**
 * 单向列表
 * @author ellasa
 *
 */
public class LinkList {
	private LinkList next = null;
	private Object value;
	
	@Test
	public void testPrint() {
		print(build());
	}
	/*
	 *打印单向列表 
	 */
	public void print(LinkList list) {
		while (list != null) {
			System.out.print(list.value);
			list = list.next;
			if (list != null) {
				System.out.print("-->");
			}
		}
	}
	
	public LinkList build() {
		LinkList root = new LinkList();
		root.value = new Integer(1);
		
		LinkList next1 = new LinkList();
		next1.value = new Integer(2);
		root.next = next1;
		
		LinkList next2 = new LinkList();
		next2.value = new Integer(3);
		next1.next = next2;
		
		return root;
	}
	
	@Test
	public void testTheKthValue() {
		LinkList list = TheKthValue(build(), 3);
		System.out.println("\n==========================");
		System.out.println(list.value);
		
		list = TheKthValue(build(), 0);
		System.out.println("\n==========================");
		System.out.println(list.value);
		
		
		list = TheKthValue(build(), 5);
		System.out.println("\n==========================");
		System.out.println(list.value);
	}
	/**
	 * 第 k 个元素的值，k可能大于列表个数,root起始0，k--0
	 * @param list
	 * @return
	 */
	public LinkList TheKthValue(LinkList list, int k) {
		int max =0;
		
		LinkList tmp = list;
		while(list != null) {
			max++;
			list = list.next;
		}
		
		
		int index = k % max;
		int i = 0;
		while(tmp != null) {
			if (i++ == index) {
				break;
			}
			tmp = tmp.next;
		}
		return tmp;
	}

}
