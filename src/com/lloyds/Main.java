package com.lloyds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // take salary from user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your salary in pounds(£):");
        double salary = scanner.nextDouble();

        System.out.println("Total tax paid: £" + CalculateTaxes.calculateTaxes(salary));
    }
}