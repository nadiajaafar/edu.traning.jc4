package edu.traning.jc4;
import java.util.Scanner;



public class Main15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите первое число:");
         double numberA = scanner.nextDouble();
        System.out.print("Введите второе число:");
        double numberB = scanner.nextDouble();

        double larger, smaller;


            if (numberA > numberB) {
                larger = numberA;
                smaller = numberB;

            } else {
                larger = numberB;
                smaller = numberA;

            }

            smaller = (numberA + numberB)/2;
            larger = 2 * numberA * numberB;

            System.out.println("Меньшее число после замены: " + smaller);
            System.out.println("Большее число после замены: " + larger);




        }



    }



