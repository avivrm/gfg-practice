package com.gfg.practice.avinash.recusrsion;

import java.util.ArrayList;
import java.util.List;

// given a set as string, print all subsets of it (in any order)
// ip - str = "ABC"
// oop - "", "A", "B", "C", "AB", "BC", "ABC"
public class PrintSubSets {

    public static void main(String[] args) {

        String str = "abc";
      //  powerSet(str,0,"");

        int[] array = {1, 2, 3};

        List<List<Integer>> list = subsets(array);

        for(List<Integer> parentList : list){
            for(Integer val : parentList){
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }

    // by recursion
    public static void powerSet(String str, int index, String curr){

        if(index == str.length()){
           System.out.println(curr);
           return;
        }

        powerSet(str, index+1,curr);

        powerSet(str, index+1,curr + str.charAt(index) );

    }

    // by backtracking
    static List<List<Integer>> subsets(int array[])
    {
        List<List<Integer>> list = new ArrayList<>();
        subsetsUtil(list, new ArrayList<>(), array, 0);
        return list;
    }


    static void subsetsUtil(List<List<Integer>> list, List<Integer> res, int array[], int index)
    {
        System.out.println("list = [" + list + "], res = [" + res + "], array = [" + array + "], index = [" + index + "]");

        list.add(new ArrayList<>(res));
        for(int i = index; i < array.length; i++)
        {
            // include the array[i] in subset.
            res.add(array[i]);

            // move onto the next element.
            subsetsUtil(list, res, array, i + 1);

            // exclude the array[i] from subset and triggers
            // backtracking.
           res.remove(res.size() - 1);
        }

    }
}
