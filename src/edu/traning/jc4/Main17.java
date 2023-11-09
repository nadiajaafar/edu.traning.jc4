package edu.traning.jc4;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        double m = scanner.nextDouble();
        System.out.print("Введите второе число:");
        double n = scanner.nextDouble();

        double larger, smaller;


        if (m != n) {
            if (m > n) {

                n = m;
            } else {

                m = n;

            }

        } else {
            m = 0;
            n = 0;

        }

        System.out.println("Числа после замены: " + m + "\n" + n);


    }


}


