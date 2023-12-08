package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//        X x = new Y();
//        List<X> list = new ArrayList<X>();
        List<Number> list = new ArrayList<Number>();
        list.add(18);
        list.add(12.3);
        System.out.println(list);
    }
}

class X{

}
class Y extends X {

}