package com.company;

public class Main{
    public static void main(String[] args) {
        System.out.println("开始");
    }
}

class Person {
    protected String name;
    protected int age;
    public Person (String name,int age) {
      this.name = name;
      this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends  Person
{
    public  Student (String name, int age, int id) {
        super(name,age);
    }

    public int findVar () {
        return super.age;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return "傻傻";
    }
}
