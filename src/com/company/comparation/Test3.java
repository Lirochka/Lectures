package com.company.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList();
        Employee2 emp1 = new Employee2(100, "Ilnar", "Tregulov", 12345);
        Employee2 emp2 = new Employee2(15, "Lira", "Yarhukhametova", 19345);
        Employee2 emp3 = new Employee2(102, "Ilnar", "Moroz", 2345);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);

    }
}

class Employee2
      implements Comparable<Employee2>
{
    int id;
    String name;
    String surname;
    int salary;

    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee2 anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
//        return this.id- anotherEmp.id;
//        int res = this.name.compareTo(anotherEmp.name);
//        if (res == 0) {
//            res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;
    }
}

//class IdComparator implements Comparator<Employee2> {
//    @Override
//    public int compare(Employee2 emp1, Employee2 emp2) {
//        if (emp1.id == emp2.id) {
//            return 0;
//        } else if (emp1.id < emp2.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//}

class NameComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.salary-emp2.salary;
    }
}

