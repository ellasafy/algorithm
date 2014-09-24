package com.algorithm.stack;

/**
 * stack push，pop，getmin，O(1)复杂度
 * @author ellasafy
 *
 */
public class StackWithMin {
	//构建两个stack，一个main，一个min
    private int elem[] = new int[16];
    private int minelem[] = new int[16];
    private int pos = -1;
    
    public static void main(String[] args) {
    	StackWithMin stack = new StackWithMin();
    	stack.push(8);
    	stack.push(2);
    	stack.push(2);
    	stack.push(3);
    	stack.push(1);
    	System.out.println(stack);
    	System.out.println("min: " + stack.min());
    	System.out.println("=======================");
    	stack.pop();
    	System.out.println(stack);
    	System.out.println("min: " + stack.min());
    	
    	System.out.println("=======================");
    	stack.pop();
    	System.out.println(stack);
    	System.out.println("min: " + stack.min());
    	
    	System.out.println("=======================");
    	stack.pop();
    	System.out.println(stack);
    	System.out.println("min: " + stack.min());
    	
    	System.out.println("=======================");
    	stack.pop();
    	System.out.println(stack);
    	System.out.println("min: " + stack.min());
    }
    
    public void push(int i) {
    	if(pos < elem.length -1) {
    		
    		elem[++pos] = i;
    		
    		if (pos == 0) {
    			minelem[pos] = i;
    		}else {
    			if (minelem[pos -1] > i) {
    				minelem[pos] = i;
    			} else {
    				minelem[pos] = minelem[pos -1];
    			}
    		}
    	} 
    }
    
    public int pop() {
    	if (pos >= 0) {
    		return elem[pos--];
    	} 
    	throw new ArrayIndexOutOfBoundsException();
    }
    
    public int min() {
    	if (pos >= 0) {
    		return minelem[pos];
    	} 
    	throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
    	StringBuilder str = new StringBuilder();
    	for (int i = pos; i >=0; i--) {
    		str.append(elem[i] + "\n");
    	}
    	return str.toString();
    }
}
