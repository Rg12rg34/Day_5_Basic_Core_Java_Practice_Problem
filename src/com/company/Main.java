package com.company;
//import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double add = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No : ");
        double no = sc.nextDouble();
        for (int p = 1; p <= no; p++) {
            add = add + (1.0 / p);
        }
        System.out.println("The Harmonic of " + no + " is : " + add);
    }
}