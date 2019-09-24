package com.company;

public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl("Inna", 25);
        Girl girl1 = new Girl("Inna", 25);
        SuperGirl SuperGirl = new SuperGirl("Inna", 25);
        System.out.println(girl.hashCode());
        System.out.println(girl1.hashCode());
        System.out.println(girl.equals(girl1));
        System.out.println(girl);
        System.out.println(Girl.count);
        System.out.println(SuperGirl.count);
    }
}
