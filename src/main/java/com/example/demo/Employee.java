package com.example.demo;


import java.util.Date;

public class Employee {
    private String name;
    private int age;
    private Date createDate;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Employee(String name, int age, Date createDate) {
        this.name = name;
        this.age = age;
        this.createDate = createDate;
    }

    public Employee() {
    }
}
