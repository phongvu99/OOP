package com.ict9.oop;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Where are you learning Java?");
        String country = userInput.nextLine();
        System.out.println("How old are you?");
        int age = userInput.nextInt();
        userInput.close();
        System.out.println("I'm learning from " + country);
        System.out.println("I'm " + age + " years old");
        Bonus bonus = new Bonus();
        bonus.Greeting();
    }
    public void Greeting() {
        System.out.println("Hello!");
    }
}