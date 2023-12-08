package com.company.generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(100);
        int a = GetMethod.getSecond(arr1);
        System.out.println(a);

//        ArrayList<String> arr2 = new ArrayList<String>();
//        arr2.add("Hi");
//        arr2.add("Ok");
//        arr2.add("I'm");
//        String b = GetMethod.getSecond(arr2);
//        System.out.println(b);
    }
}

class GetMethod{
public static <T extends Number> T getSecond(ArrayList<T> arr){
    return arr.get(1);
}
}
