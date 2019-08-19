package com.gfg.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{

    private static List<String> list= new ArrayList<>();

    static{
        list.add("");    // index 0
        list.add("");    //  1
        list.add("abc"); // 2
        list.add("def"); // 3
        list.add("ghi"); // 4
        list.add("jkl"); // 5
        list.add("mno"); //  6
        list.add("pqrs");// 7
        list.add("tuv"); //  8
        list.add("wxyz");// 9
    }

    public static void main(String[] args ) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String strArr = "2 3 4";

        List<Integer> intList  = Arrays.stream(strArr.split(" ")).
                mapToInt(Integer :: parseInt).boxed().collect(Collectors.toList());

        List<String> strList = intList.stream().map(i-> list.get(i)).collect(Collectors.toList());

        System.out.println( strList );
    }
}
