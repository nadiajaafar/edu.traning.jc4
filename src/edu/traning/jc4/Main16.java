package edu.traning.jc4;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Введите координату x для точки A: ");
        double x = scanner.nextDouble();
        System.out.print("Введите координату y для точки A: ");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Точка A находится в начале координат.");
        } else if (x == 0) {
            System.out.println("Точка A лежит на оси Y.");
        } else if (y == 0) {
            System.out.println("Точка A лежит на оси X.");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("Точка A находится в первом квадранте.");
            } else if (x < 0 && y > 0) {
                System.out.println("Точка A находится во втором квадранте.");
            } else if (x < 0 && y < 0) {
                System.out.println("Точка A находится в третьем квадранте.");
            } else {
                System.out.println("Точка A находится в четвертом квадранте.");
            }
        }
    }
}



