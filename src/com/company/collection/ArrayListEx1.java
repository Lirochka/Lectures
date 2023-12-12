package com.company.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Zaur");
        arrayList.add("Ivan");
        arrayList.add("Lira");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList();
        arrayList2.add("Zaur");
        System.out.println(arrayList2);

        ArrayList<String> arrayList3 = new ArrayList(200);
        List<String> arrayList4 = new ArrayList();

        ArrayList<String> arrayList5 = new ArrayList(arrayList);
        System.out.println(arrayList5);
    }
}
