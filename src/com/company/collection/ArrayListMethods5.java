package com.company.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Lira");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        List<Integer> list1 = List.of(3, 8, 2);
        System.out.println(list1);
//        list1.add(100);
//        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);



//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[5]);
//
//        for (Object s: array){
//            System.out.println(s);
//        }
//        System.out.println("-------------------");
//        for (String s: array2){
//            System.out.println(s);
//        }

//        List<String > myList = arrayList1.subList(1, 4);
//        System.out.println(myList);
//        myList.add("Fedor");
//        System.out.println(myList);
//        System.out.println(arrayList1);
//        arrayList1.add("Svets");
//        System.out.println(arrayList1);
//        System.out.println(myList);

//        ArrayList<String> arrayList2 = new ArrayList<String>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Lira");
 //       arrayList2.add("Igor");

      //  arrayList1.removeAll(arrayList2);
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);
    }
}
