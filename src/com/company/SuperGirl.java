package com.company;

public class SuperGirl extends Girl {
    static int count;

    public SuperGirl(String name, int age) {
        super(name, age);
        count++;
    }
}
