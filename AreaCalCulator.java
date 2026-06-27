package AreaCalCulator;

import java.util.Scanner;

public class AreaCalCulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Squre:");
        int length = input.nextInt();
        System.out.println("Square Area=" + length * length);
        System.out.print("Enter length of Rectangle:");
        int length1 = input.nextInt();
        System.out.print("Enter width of Rectangle:");
        int width = input.nextInt();
        System.out.println("Rectangle Area=" + length1 * width);
        System.out.print("Enter height of Triangle:");
        int height = input.nextInt();
        System.out.print("Enter base of Triangle:");
        int base = input.nextInt();
        double triarea = 0.5 * base * height;
        System.out.println("triangle Area=" + triarea);
        System.out.print("Enter Radius of Circle:");
        int radius = input.nextInt();
        double pi = 3.1416;
        double circle = pi * radius * radius;
        System.out.println("Circle Area=" + circle);

    }

}
