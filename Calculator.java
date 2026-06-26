package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.print("First number:");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        System.out.print("Second number:");
        int b = input.nextInt();
        System.out.println(" Addition=" + (a + b));
        System.out.println(" Subtraction=" + (a - b));
        System.out.println(" Multiplication=" + (a * b));
        System.out.println(" Division=" + (a / b));

    }

}
