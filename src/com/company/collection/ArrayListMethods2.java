package com.company.collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student std1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student std2 = new Student("Nikola", 'm', 28, 2, 6.4);
        Student std3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student std4 = new Student("Petr", 'm', 35, 4, 7);
        Student std5 = new Student("Lira", 'f', 23, 3, 7.4);
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);
        studentList.add(std4);
        studentList.add(std5);
        System.out.println(studentList);
        Student std6 = new Student("Lira", 'f', 23, 3, 7.4);
        studentList.remove(std5);
        System.out.println("-----------------------");
        System.out.println(studentList);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

}

