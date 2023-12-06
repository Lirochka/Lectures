package com.company.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList();
        list.add("Lira");
        list.add("Zaur");
        list.add("Mariya");
        System.out.println("Before");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("after");
        System.out.println(list);
    }
}
