package edu.traning.jc4;
import java.lang.Math;

public class Main12 {

    public static void main(String[] args) {

//            Даны три действительных числа.
//            Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую
//            степень — отрицательные.

        double a = 2.3;
        double b = 4.5;
        double c = -5.6;

        if (a > 0) {
            System.out.println(Math.pow(a, 2));
        }
        if (b > 0) {
            System.out.println(Math.pow(b, 2));
        }
        if (c > 0) {
            System.out.println(Math.pow(c, 2));
        }

        if (a < 0) {
            System.out.println(Math.pow(a, 4));
        }
        if (b < 0) {
            System.out.println(Math.pow(b, 4));
        }
        if (c < 0) {
            System.out.println(Math.pow(c, 4));


        }


    }

}