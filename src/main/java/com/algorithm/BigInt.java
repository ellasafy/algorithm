package com.algorithm;

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

}
