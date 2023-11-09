package edu.traning.jc4;
import java.util.Scanner;

import java.lang.Math;

public class Main10 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);
    System.out.println("Введите радиус первого круга ");
    double R1 = scanner.nextDouble();
    System.out.println("Введите радиус второго круга");
    double R2 = scanner.nextDouble();

    double area1 =  Math.PI * R1 * R1;

    double area2 = Math.PI * R2 * R2;

        if (area1 < area2) {
            System.out.println("Площадь первого круга меньше.");
        } else if (area1 > area2) {
            System.out.println("Площадь второго круга меньше.");
        } else {
            System.out.println("Площади кругов равны.");
        }


    }


}
