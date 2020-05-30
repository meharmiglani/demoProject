package com.mehar;

public class Employee {
    int name;
    int age;

    public Employee(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void calc_age(){
        System.out.println("Imported from IntelliJ");
    }
}
