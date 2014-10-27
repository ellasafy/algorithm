package com.algorithm.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class StringAll {

	@Test
	public void testSumOfChar() {
		String a = "abababccccc";
		String b = "abc";

		sumOfChar(a, b);
	}

	/**
	 * 给定两个字符串，a，b，求a中b出现次数
	 * 
	 * @param orgin
	 * @param test
	 */
	public void sumOfChar(String orgin, String test) {
		char[] orginChar = orgin.toCharArray();
		char[] testChar = test.toCharArray();

		boolean tmp[] = new boolean[128];

		for (int i = 0; i < testChar.length; i++) {
			tmp[testChar[i]] = true;
			System.out.println(testChar[i]);
		}

		int[] sum = new int[128];

		// Map<String, Integer> mp = new HashMap<String, Integer>();
		for (int i = 0; i < orginChar.length; i++) {
			if (tmp[orginChar[i]]) {
				sum[orginChar[i]]++;
			}
		}

		for (int i = 0; i < testChar.length; i++) {
			if (sum[testChar[i]] > 0) {
				System.out.println(testChar[i] + " : " + sum[testChar[i]]);
			}
		}

	}

	@Test
	public void testFindElem() {
		String ss = "abcaefflf";
		findElem(ss);
		System.out.println("");
		String sss = "abcaefflfeeecceee";
		findElem(sss);
	}

	/**
	 * a~z包括大小写与0~9组成的N个数 用最快的方式把其中重复的元素挑出来。
	 * 
	 * @param s
	 */
	public void findElem(String s) {
		char[] ss = s.toCharArray();
		int[] tmp = new int[128];
		for (int i = 0; i < ss.length; i++) {
			if (tmp[ss[i]] == 1) {
				System.out.print(ss[i] + " ");
				tmp[ss[i]]++;
			} else {
				tmp[ss[i]]++;
			}
		}
	}
	

    /*
     * brute force way of checking if array contains duplicates in Java
     * comparing each elements to all other elements of array
     * complexity on order of O(n^2) not advised in production
     */
    public static boolean bruteforce(String[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
    /*
     * detect duplicate in array by comparing size of List and Set
     * since Set doesn't contain duplicate, size must be less for an array which contains duplicates
     */
    public static boolean checkDuplicateUsingSet(String[] input){
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);
        if(inputSet.size()< inputList.size()) {
            return true;
        }
        return false;
    }
  
    /*
     * Since Set doesn't allow duplicates add() return false
     * if we try to add duplicates into Set and this property
     * can be used to check if array contains duplicates in Java
     */
    public static boolean checkDuplicateUsingAdd(String[] input) {
        Set tempSet = new HashSet();
        for (String str : input) {
            if (!tempSet.add(str)) {
                return true;
            }
        }
        return false;
    }
    
    @Test
    public void testFindFirstSingleChar() {
    	String s = "abaccdeff";
    	System.out.println(findFirstSingleChar(s));
    }
    /**
     * 在一个字符串中找到第一个只出现一次的字符。如输入abaccdeff，则输出b。  
     * @param s
     * @return
     */
    public Character findFirstSingleChar(String s) {
    	TreeMap<Character, Boolean> tree = new TreeMap<Character, Boolean>();
    	char[] chars = s.toCharArray();
    	for (int i =0; i < chars.length; i++) {
    		if (tree.get(chars[i]) == null) {
    			tree.put(chars[i], true);
    		}else {
    			tree.put(chars[i], false);
    		}
    	}
    	Iterator<Map.Entry<Character, Boolean>> it = tree.entrySet().iterator();
    	
    	while (it.hasNext()) {
    		Map.Entry<Character, Boolean> mp = it.next();
    		if (mp.getValue()) {
    			return mp.getKey();
    		}
    	}
    	return null;
    }


}
