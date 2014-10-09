package com.algorithm;

import java.nio.ByteBuffer;

import org.junit.Test;

public class MainTest {

	@Test
	public void imutableTest() {
		System.out.println(2%7);
	}
	
	public void change(Integer i) {
		String ss = "sss";
		ss.toCharArray();
		 boolean[]  tempBoolean = new boolean[128];
		 
		 
		
	}
	
    public static String removeSpecificChars(String originalstring ,String removecharacterstring)
    {
        char[] orgchararray=originalstring.toCharArray();
        char[] removechararray=removecharacterstring.toCharArray();
        int start,end=0;
        
        //tempBoolean automatically initialized to false ,size 128 assumes ASCII
        boolean[]  tempBoolean = new boolean[128];
        
        //Set flags for the character to be removed
        for(start=0;start < removechararray.length;++start)
        {
            tempBoolean[removechararray[start]]=true;
        }
        
        //loop through all characters ,copying only if they are flagged to false
        for(start=0;start < orgchararray.length;++start)
        {
            if(!tempBoolean[orgchararray[start]])
            {
                orgchararray[end++]=orgchararray[start];
            }
        }
        
        
        return new String(orgchararray,0,end);
    }
}
