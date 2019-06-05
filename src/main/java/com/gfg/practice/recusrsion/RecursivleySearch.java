package com.gfg.practice.recusrsion;

//Recursive program to linearly search an element in a given array
public class RecursivleySearch {

    public static void main(String[] args) {
        String line = "Hi I Am Avinash and I want to meet pooja";

        String[] str = line.split(" ");

        System.out.println(getIndex(str, 0, str.length-1, "and"));
    }

    static int getIndex(String[] str, int start, int end, String word){
        if(start>end)
            return -1;

        if(str[start].equalsIgnoreCase(word)){
            return start;
        }else if(str[end].equalsIgnoreCase(word)){
            return end;
        }

        return getIndex(str, start+1, end-1, word);
    }
}
