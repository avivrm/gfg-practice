package com.gfg.practice.avinash.recusrsion;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String str = "11011";
        System.out.println(getDecimal(str));

        System.out.println(getDecimalRecursive(str, str.length()-1, 0, 0));
    }

    // not working
    static int getDecimalRecursive(String str, int pos, int n, int count ){
      /*char c = str.charAt(pos);
        if(pos == n){
            if(c - '0' == 0){
                return 0;
            }else{
                return (int) (Math.pow(2, count));
            }
        }

        return (c - '0' == 0 ? 0 : (int) (Math.pow(2, count)) + getDecimalRecursive(str, pos - 1, n, count+1));*/

      return 0;

    }

    static int getDecimal(String str){
        int result = 0;
        int count = 0;
        for(int i=str.length()-1;i>=0;i--, count++){
            char c = str.charAt(i);
            if(c-'0' != 0){
                result = result + (int)Math.pow(2,count);
            }

        }

        return result;
    }
}
