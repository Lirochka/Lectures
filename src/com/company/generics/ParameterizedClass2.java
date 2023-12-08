package com.company.generics;


public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("privet", 20);
        System.out.println("Znachenie pari: value1 = " + pair.getFirstValue() +
                ", value2 = " + pair.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<Integer, Double>(156, 200.36);
        System.out.println("Znachenie pari: value1 = " + pair2.getFirstValue() +
                ", value2 = " + pair2.getSecondValue());

        OtherPair<String> otherPair = new OtherPair<String>("ok", "privet");
        System.out.println("Znachenie pari: value1 = " + otherPair.getFirstValue() +
                ", value2 = " + otherPair.getSecondValue());
    }

}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}