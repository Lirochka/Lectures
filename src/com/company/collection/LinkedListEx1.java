package com.company.collection;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 std1 = new Student2("Ivan", 'm');
        Student2 std2 = new Student2("Nikola", 'm');
        Student2 std3 = new Student2("Elena", 'f');
        Student2 std4 = new Student2("Petr", 'm');
        Student2 std5 = new Student2("Lira", 'f');
        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(std1);
        student2LinkedList.add(std2);
        student2LinkedList.add(std3);
        student2LinkedList.add(std4);
        student2LinkedList.add(std5);
        System.out.println("LinkedList = " + student2LinkedList);
        System.out.println(student2LinkedList.get(2));
        Student2 std6 = new Student2("Zaur", 'm');
        Student2 std7 = new Student2("Igor", 'f');
        student2LinkedList.add(std6);
        System.out.println("LinkedList = " + student2LinkedList);
        student2LinkedList.add(1, std7);
        System.out.println("LinkedList = " + student2LinkedList);
        student2LinkedList.remove(3);
        System.out.println("LinkedList = " + student2LinkedList);
    }
}

class Student2 {
    private String name;
    private int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
        return course == student.course &&
                Objects.equals(name, student.name);
    }
}

