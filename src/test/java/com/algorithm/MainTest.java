package com.algorithm;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class MainTest {

	@Test
	public void imutableTest() {
		System.out.println(2%7);
	}
	
	public void change(Integer i) {
<<<<<<< HEAD
		String ss = "sss";
		ss.toCharArray();
		 boolean[]  tempBoolean = new boolean[128];
		 
		 
=======
		i = i +1;
		System.out.println(i);
		Collection<String> list = new ArrayList<String>();
>>>>>>> 54e897b536be64827ac84ab43c9d396e727c5785
		
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
