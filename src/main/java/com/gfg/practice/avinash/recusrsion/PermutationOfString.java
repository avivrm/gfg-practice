package com.gfg.practice.avinash.recusrsion;

public class PermutationOfString {

    public static void main(String[] args) {

        String str = "ABC";
        int n = str.length();
        permutation(str, 0, n-1);

    }



    public static void permutation(String str, int l, int h){
        if (l == h)
            System.out.println(str);
        else
        {
            for (int i = l; i <= h; i++)
            {
                str = swap(str,l,i);
                permutation(str, l+1, h);
                str = swap(str,l,i);
            }
        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
