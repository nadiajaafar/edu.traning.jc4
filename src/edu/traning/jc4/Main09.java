package edu.traning.jc4;

import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a");
        double a = scanner.nextDouble();

        System.out.println("Введите число b");

        double b = scanner.nextDouble();

        System.out.println("Введите число c");

        double c = scanner.nextDouble();

        if (a == b & a == c & b == c) {

            System.out.println("Треугольник является равносторонним");
        } else {

            System.out.println("Треугольник не является равносторонним");

        }

    }
}
