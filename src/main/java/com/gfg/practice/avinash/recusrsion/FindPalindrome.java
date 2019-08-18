package com.gfg.practice.recusrsion;

public class FindPalindrome {

    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }

    static boolean isPalindrome(String s, int start, int end){
        if(start>end)
            return false;

        if(start == end)
            return true;

        if(s.charAt(start) == s.charAt(end)){
           return isPalindrome(s, start+1, end-1);
        }



        return false;
    }
}
