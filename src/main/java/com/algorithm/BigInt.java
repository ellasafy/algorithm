package com.algorithm;

import org.junit.Test;

public class BigInt {
	
	public static void main(String[] args) {
		String a = "4343";
		String b = "4341";
		System.out.println(Integer.valueOf(b) - Integer.valueOf(a));
		System.out.println(minus(b, a));
	}
	
	public static  String minus(String a, String b) {
		
		int alen = a.length();
		int blen = b.length();
		int max = alen;
		if (alen > blen) {
			max = alen;
			for (int i = 0; i < alen - blen; i++) {
				a = "0" +a;
			}
		}
		
		if (alen < blen) {
			max = blen;
			for (int i = 0; i < blen - alen; i++) {
				b = "0" + b;
			}
		}
		System.out.println(a + " - " + b);
		//进位
		int tmp = 0;
		String ret = "";
		for (int i = max -1; i >=0; i--) {
			int avalue = a.charAt(i);
			int bvalue = b.charAt(i);
			
			if(avalue - bvalue -tmp < 0 && i != 0) {
				ret = (avalue - bvalue -tmp ) + ret;
				tmp = 1;
			} else {
				ret = (avalue - bvalue - tmp) + ret;
			}
		}
		return ret;
	}
	
	@Test
	public void testAdd() {
		System.out.println(bigIntAdd("22222", "222222"));
	}
	public String bigIntAdd(String s1, String s2) {
		if (s1.length() > s2.length()) {
			for (int i = 0; i < s1.length() - s2.length(); i++) {
				s2 = "0" + s2;
			}
		}else {
			for (int i = 0;i < s2.length() - s1.length(); i++) {
				s1 = "0" + s1;
			}
			
			
		}
		System.out.println(s1);
		System.out.println(s2);
		
		int tmp = 0;
		String ret = "";
		for (int i = s2.length() -1;i >=0;i--) {
			int x1 = Integer.valueOf(s1.charAt(i)) -48;
			int x2 = Integer.valueOf(s2.charAt(i)) -48;
			int x = x1 + x2 + tmp;
			if (x >=10) {
				x = x -10;
				tmp = 1;
			}
			ret = x + ret;
			
		}
		if (tmp == 0) {
			return ret;
		}else {
			return 1+ret;
		}
	}
	
	@Test
	public void testMinus() {
		System.out.println(minus2("22222", "3332"));
	}
	public String minus2(String s1, String s2) {
	     String pos = "";
	     String max = "";
	     String min = "";
	     int maxLen;
	     int len1 = s1.length();
	     int len2 = s2.length();
	     
	     if (len1 > len2) {
	    	 max = s1;
	    	 min = s2;
	    	 maxLen = len1;
	     }else if (len1 < len2) {
	    	 max = s2;
	    	 min = s1;
	    	 maxLen = len2;
	    	 pos = "-";
	     }else {
	    	int i = max(s1, s2);
	    	if (i == 0) {
	    		return "0";
	    	}else if (i ==1) {
	    		max = s1;
	    		min = s2;
	    		maxLen = len1;
	    	}else {
	    		max = s2;
	    		min = s1;
	    		pos="-";
	    		maxLen = len2;
	    	}
	     }
	     
	     for (int i = 0; i< max.length() - min.length();i++) {
	    	 min = "0" + min;
	     }
	     System.out.println(max);
	     System.out.println(min);
	     
	     int tmp = 0;
	     String ret = "";
	     for (int i = maxLen -1; i >=0;i--) {
	    	 int x = Integer.valueOf(max.charAt(i)) - Integer.valueOf(min.charAt(i))
	    			 + tmp;
	    	 if (x < 0) {
	    		 x = x+ 10;
	    		 tmp = -1;
	    	 }
	    	 ret = x + ret;
	     }
	     return pos+ret;
	     
	}
	
	public int max(String s1, String s2) {
		int i=0;
		while(i < s1.length()) {
			if (Integer.valueOf(s1.charAt(i)) > Integer.valueOf(s2.charAt(i))) {
				return 1;
			}else if (Integer.valueOf(s1.charAt(i))< Integer.valueOf(s2.charAt(i))){
				return 2;
			}
           i++;
		}
		return 0;
	}

}
