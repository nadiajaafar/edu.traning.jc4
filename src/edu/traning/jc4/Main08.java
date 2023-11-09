package edu.traning.jc4;
import java.util.Scanner;
import java.lang.Math;


public class Main08 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a");
        double a = scanner.nextDouble();
        System.out.println("Введите число b");
        double b = scanner.nextDouble();

        if (Math.pow(a, 2) > Math.pow(b, 2)) {
            System.out.println("Квадрат числа a больше квадрата числа b");
        }

        if (Math.pow(b, 2) > Math.pow(a, 2)) {
            System.out.println("Квадрат числа b больше квадрата числа a");

        }




        }

    }