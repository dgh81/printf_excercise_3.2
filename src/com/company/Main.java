package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    double T_celsius;
    double T_fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius: ");
        T_celsius = scanner.nextInt();
        T_fahrenheit = T_celsius*9/5+32;
        System.out.println(T_fahrenheit);
    }
}
