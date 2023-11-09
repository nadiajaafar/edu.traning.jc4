package edu.traning.jc4;

import java.util.Scanner;
import java.lang.Math;

public class Main11 {

//        Составить программу, которая определит площадь какого треугольника больше.
        public static void main(String[] args) {

            Scanner scanner = new Scanner (System.in);
            System.out.println("Введите длину первой стороны треугольника 1:");
            double a1 = scanner.nextDouble();
            System.out.println("Введите длину второй стороны треугольника 1:");
            double b1 = scanner.nextDouble();
            System.out.println("Введите длину третьей стороны треугольника 1:");
            double c1 = scanner.nextDouble();

            System.out.println("Введите длину первой стороны треугольника 2:");
            double a2 = scanner.nextDouble();
            System.out.println("Введите длину второй стороны треугольника 2:");
            double b2 = scanner.nextDouble();
            System.out.println("Введите длину третьей стороны треугольника 2:");
            double c2 = scanner.nextDouble();

            System.out.println("Введите длину первой стороны треугольника 3:");
            double a3 = scanner.nextDouble();
            System.out.println("Введите длину второй стороны треугольника 3:");
            double b3 = scanner.nextDouble();
            System.out.println("Введите длину третьей стороны треугольника 3:");
            double c3 = scanner.nextDouble();

            double p1 = (a1 + b1 + c1)/2;
            double p2 = (a2 + b2 + c2)/2;
            double p3 = (a3 + b3 + c3)/2;

            double S1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
            double S2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));
            double S3 = Math.sqrt(p3 * (p3 - a3) * (p3 - b3) * (p3 - c3));

            if (S1 > S2 && S1 > S3) {
                System.out.println("Площадь первого треугольника больше.");
            } else if (S2 > S1 && S2 > S3) {
                System.out.println("Площадь второго треугольника больше.");
            } else {
                System.out.println("Площадь третьего треугольника больше.");
            }


        }



    }

