package com.company;

import java.util.Objects;

public class Girl {
    static int count;
    private String name;
    static {
        System.out.println("hi from static block!!!");
    }
    {
        System.out.println("hi from not static block!!!");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>20 && age<40){
            this.age =age;
        }
        this.age = age;
    }

    private int age;


    public Girl(String name, int age){
        this.name = name;
        setAge(age);
        count++;
    }

    static int getCount(){
        return count;
    }


        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age &&
                Objects.equals(name, girl.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
