package com.company.generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolchild schoolchild1 = new Schoolchild("Ivan", 13);
        Schoolchild schoolchild2 = new Schoolchild("Matiya", 15);

        Student student1 = new Student("Nicolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Lira", 39);

        Team<Schoolchild> schoolchildTeam = new Team<Schoolchild>("Drakoni");
        Team<Student> studentTeam = new Team<Student>("Vpered");
        Team<Employee> employeeTeam = new Team<Employee>("Rabotyagi");

        schoolchildTeam.addNewParticipants(schoolchild1);
        schoolchildTeam.addNewParticipants(schoolchild2);

        studentTeam.addNewParticipants(student1);
        studentTeam.addNewParticipants(student2);

        employeeTeam.addNewParticipants(employee1);
        employeeTeam.addNewParticipants(employee2);

        Team<Schoolchild> schoolchildTeam2 = new Team<Schoolchild>("Mudreci");
        Schoolchild schoolchild3 = new Schoolchild("Sergei", 12);
        Schoolchild schoolchild4 = new Schoolchild("Olya", 14);
        schoolchildTeam2.addNewParticipants(schoolchild3);
        schoolchildTeam2.addNewParticipants(schoolchild4);
        schoolchildTeam.playWith(schoolchildTeam2);
    }
}
