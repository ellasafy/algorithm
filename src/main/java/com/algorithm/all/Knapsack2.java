package com.algorithm.all;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Knapsack2 {
    
    @Test
    public void test() {
        int arr[] = new int[] {1,5,5};
        List<Integer> list = new ArrayList<Integer>();
        Integer it = new Integer(arr[1]);
        list.add(arr[0]);
        list.add(it);
        list.add(arr[2]);
        System.out.println(list.size());
        
        list.remove(it);
        System.out.println(list.size());
        
//        list.remove(arr[2]);
    }
    @Test
    public void testknapsackR1() {
         int arr[] = new int[] {1,2,3,4,5,7,8,9};
         List<Integer> list = new ArrayList<Integer>();
         knapsackR1(list, 11, arr, arr.length);
         
         for (List<Integer> li: set) {
             for(Integer i : li) {
                 System.out.print(i + " ");
             }
             
             System.out.println();
         }
    }
    public Set<List<Integer>> set = new HashSet<List<Integer>>();
    public void knapsackR1(List<Integer> list, int m, int[] arr, int n) {
        if (m == 0|| n == 0) {
            return;
        }
        
        if (arr[n-1] > m) {
            knapsackR1(list, m, arr, n-1);
        }
        
        if (arr[n-1] == m) {
            Integer tmp = new Integer(arr[n-1]);
            list.add(tmp);
            List<Integer> tmp2 = new ArrayList<Integer>();
            for (Integer i : list) {
                tmp2.add(i);
            }
            set.add(tmp2);
            list.remove(tmp);
            return;
        }
        
        Integer tmp = new Integer(arr[n-1]);
        list.add(tmp);
        knapsackR1(list, m - arr[n-1], arr, n-1);
        list.remove(tmp);
        
        
        knapsackR1(list, m, arr, n-1);
    }
    
    @Test
    public void testKapsack() {
        int[] value = new int[] {60,100,120};
        int[] wt = new int[] {10,20,30};
        System.out.println(knapsack(50, wt, value, wt.length));
    }
    public int knapsack(int w, int[] wt, int[] value, int n) {
        if (w == 0 || n == 0) {
            return 0;
        }
        if (wt[n-1] > w) {
            return knapsack(w, wt,value, n-1);
        }
        
        int val1 = value[n-1] + knapsack(w-wt[n-1], wt, value, n-1);
        int val2 = knapsack(w, wt, value, n-1);
        
         return val1 > val2?val1: val2;
    }

}
