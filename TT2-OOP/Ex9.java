package com.ict9.oop;

public class Ex9 {
    public static void main(String[] args) {
        double temp = 0;
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            String a = args[i]; double l = Double.parseDouble(a);
            temp += l;
        }
        double mean = temp / args.length;
        for (int i = 0; i < args.length; i++) {
            String a = args[i]; double l = Double.parseDouble(a);
            sum += Math.pow(l - mean, 2);
        }
        double ssd = Math.sqrt(sum/(args.length - 1));
        System.out.println("The mean (average) is: " + String.format("%.2f",mean));
        System.out.println("The sample standard deviation is: " + String.format("%.2f",ssd));
    }
}
