package edu.traning.jc4;

import java.util.Scanner;

public class Main19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a");
        double a = scanner.nextDouble();
        System.out.println("Введите число b");
        double b = scanner.nextDouble();
        System.out.println("Введите число c");
        double c = scanner.nextDouble();

        int count = 0;

        if (a > 0) {
            count++;
        }

        if (b > 0) {
            count++;
        }

        if (c > 0) {
            count++;
        }

        System.out.println("Количество положительных чисел среди a, b и c: " + count);
    }
}



