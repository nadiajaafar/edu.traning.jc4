package edu.traning.jc4;

import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите угол A:");
        double angleA = scanner.nextDouble();
        System.out.println("Введите угол B:");
        double angleB = scanner.nextDouble();

        double angleC = 180 - angleA - angleB;

        if (angleA + angleB + angleC == 180 && angleA > 0 && angleB > 0 && angleC > 0) {
            System.out.println("Треугольник существует");

            if (angleA == 90 || angleB == 90 || angleC == 90) {

                System.out.println("Треугольник является прямоугольным");
            } else {
                System.out.println("Треугольник не является прямоугольным");

            }
        } else {
            System.out.println(" Треугольника не существует");

        }


    }


}


        


