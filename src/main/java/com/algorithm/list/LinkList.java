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
	
	@Test
	public void testReverse() {
		LinkList l1 = new LinkList();
		l1.value=1;
		LinkList l2 = new LinkList();
		l2.value = 2;
		l1.next = l2;
		LinkList l3 = new LinkList();
		l3.value = 3;
		l2.next = l3;
		
		LinkList l4 = reverse(l1);
		
		while(l4 != null) {
			System.out.println(l4.value);
			l4 = l4.next;
		}
	}
	
	/**
	 * 将一个链表逆序
	 * @param list
	 * @return
	 */
	public LinkList reverse(LinkList list) {
		LinkList tmp1 = null;
	    LinkList tmp2 = null;
	    
	    while (list != null) {
	    	tmp2 = list.next;
	    	list.next = tmp1;
	    	tmp1 = list;
	    	list = tmp2;
	    	
	    }
	    
	    return tmp1;
	}

}
