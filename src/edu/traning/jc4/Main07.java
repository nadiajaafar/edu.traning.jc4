package edu.traning.jc4;
import java.util.Scanner;
import java.lang.Math;
public class Main07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите a");
        double a = scanner.nextDouble();
        System.out.println("Введите b");
        double b = scanner.nextDouble();
        System.out.println("Введите с");
        double c = scanner.nextDouble();
        System.out.println("Введите x");
        double x = scanner.nextDouble();

        double R = a * x * x + b * x + c;

        double module1 = Math.abs(R);

        System.out.println("Значение модуля выражения a*x^2 + b*x + c: " + module1);

        scanner.close ();

        }
    }


