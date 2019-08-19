package com.gfg.practice.avinash.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "hello".trim();
        String str2 = "ohell".trim();

        System.out.println(isAnagram(str1,str2));

    }

    static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length())
            return false;

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        for(int i=0;i<char1.length;i++){
            if(char1[i] != char2[i])
                return false;
        }

        return true;
    }



}
