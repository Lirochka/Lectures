package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
//        List<Number> list1 = new ArrayList<Integer>();
//        List<Object> list2 = new ArrayList<Integer>();
        List<?> list3 = new ArrayList<Integer>();

        //bounded wildcard
        List<? extends Number> list2 = new ArrayList<Integer>();
        List<? super Number> list6 = new ArrayList<Object>();

        List<Double> list4 = new ArrayList<Double>();
        list4.add(3.14);
        list4.add(3.15);
        list4.add(3.16);
        showListInfo(list4);

        List<String> list5 = new ArrayList<String>();
        list5.add("Ok");
        list5.add("I'm");
        list5.add("Good");
        showListInfo(list5);

        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(3.14);
        arr.add(3.15);
        arr.add(3.16);
        System.out.println(sum(arr));

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(30);
        arr2.add(303);
        arr2.add(45);
        System.out.println(sum(arr2));
    }

    static void showListInfo(List<?> list) {
        System.out.println("My list have these elements: " + list);
    }

    public static double sum(ArrayList<? extends Number> arr) {
        double sum = 0;
        for (Number n : arr) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
