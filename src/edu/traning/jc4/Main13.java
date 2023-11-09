package edu.traning.jc4;

public class Main13 {

    public static void main(String[] args) {


//    Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к
//    началу координат

        double x1 = 2;
        double y1 = 3;
        double x2 = 5;
        double y2 = 7;

        double distanceA = Math.sqrt(x1 * x1 + y1 * y1);
        double distanceB = Math.sqrt(x2 * x2 + y2 * y2);

        if (distanceA < distanceB) {

            System.out.println("Точка A ближе к началу координат.");
        } else if (distanceA > distanceB) {

            System.out.println("Точка B ближе к началу координат.");
        } else {
            System.out.println("Точки A и B находятся на одинаковом расстоянии от начала координат.");
        }
    }
}
