package com.collection.oracle;

public class Student {

    private String name;
    private int rollNo;
    private String sub;
    private int yearOfBirth;

    public Student() {
    }

    public Student(String name, int rollNo, String sub, int yearOfBirth) {
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.sub = sub;
        this.yearOfBirth = yearOfBirth;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", sub=" + sub + ", yearOfBirth=" + yearOfBirth + "]";
    }

}
