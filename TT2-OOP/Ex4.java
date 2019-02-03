package com.ict9.oop;

public class Ex4 {
    public static void main(String[] args) {
        String n = args[0]; int num = Integer.parseInt(n);
        int random = (int) (Math.random() * num);
        System.out.println(random);
    }
}