package com.algorithm;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class MainTest {

	@Test
	public void imutableTest() {
		Integer i = new Integer(5);
		Integer j = i;
		change(i);
		System.out.println(j + " " + i);
		
		System.out.println(ByteBuffer.wrap("ssssssss".getBytes()).getLong());
	}
	
	public void change(Integer i) {
		i = i +1;
		System.out.println(i);
		Collection<String> list = new ArrayList<String>();
		
	}
}
