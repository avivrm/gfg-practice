package com.gfg.practice.avinash.recusrsion;

public class ATOI {
    public static void main(String[] args) {
        String str = "123456";
        System.out.println(parseIntegerRecursive(str, str.length()-1, 0));

        System.out.println(parseInt(str));
    }

    static int parseIntegerRecursive(String str, int pos, int n){
        char c = str.charAt(pos);

        if(pos == n)
            return c - '0';

        return (10 * parseIntegerRecursive(str, pos-1, n) + c - '0');
    }

    static int parseInt(String str){
        int result = 0;

        for(int i = 0;i<=str.length()-1;i++){
            char c = str.charAt(i);
            result = 10*result + c - '0';
        }
        return result;
    }
}
