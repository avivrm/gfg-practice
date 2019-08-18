package com.gfg.practice.avinash.recursion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneNumberRecursion {

    private static List<String> strList = new ArrayList<>();

    static{

        strList.add("");
        strList.add("");
        strList.add("abc");
        strList.add("def");
        strList.add("ghi");
        strList.add("jkl");
        strList.add("mno");
        strList.add("pqrs");
        strList.add("tuv");
        strList.add("wxyz");
    }

    public static void main(String[] args) {
        int[] intArr ={2,3,4};

        List<List<String>> listOfList = getStringIntoList(intArr);

        if(intArr.length>1){
            List<String> list = getArrangements(new ArrayList<String>(),listOfList.get(0), listOfList.get(1), 0, 0);

            for(int i = 2;i<listOfList.size();i++){
                list = getArrangements(new ArrayList<String>(),list, listOfList.get(i), 0, 0);
            }

            System.out.println(list);
        }else{
            System.out.println("Enter more than 1 option");
        }

    }

    public static List<String> getArrangements(List<String> list, List<String> str1, List<String> str2, int str1Index, int str2Index){
        if(str2Index+1 > str2.size()){
            str1Index++;
            str2Index = 0;
        }
        if(str1Index+1 > str1.size()){
            return list;
        }
        list.add(str1.get(str1Index) + str2.get(str2Index));
        getArrangements(list,str1, str2, str1Index, ++str2Index);
        return list;
    }

    static List<List<String>> getStringIntoList(int[] intArr){
        List<List<String>> listOfList = new ArrayList<>();
        for (int i : intArr){
            String str = strList.get(i);
            List<String> list = Arrays.stream(str.trim().split("")).collect(Collectors.toList());
            listOfList.add(list);
        }
        return listOfList;
    }

}
