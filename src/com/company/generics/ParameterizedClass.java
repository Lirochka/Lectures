package com.company.generics;

public class ParameterizedClass {
    public static void main(String[] args) {

//        Info<String> info1 = new Info<String>("privet");
//        System.out.println(info1);
//        String s = info1.getValue();

//        Info<Integer> info2 = new Info<Integer>(1);
//        System.out.println(info2);
//        Integer i = info2.getValue();
    }
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
    //abc(Info info)
}

class Info<T extends Number & I1 & I2> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{ [" + value + "] }";
    }

    public T getValue() {
        return value;
    }
}

interface I1 {
}

interface I2 {
}

//class Parent {
//    public void abc(Info<Integer> info) {
//        Integer s = info.getValue();
//    }
//}
//
//class Child extends Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//}
