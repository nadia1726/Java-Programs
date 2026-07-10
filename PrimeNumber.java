package primenumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = input.nextInt();

        int count = 0;

        for (int i = 2; i < number; i++) {  ে
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 0 && number > 1) {
            System.out.println(number + " is Prime number");
        } else {
            System.out.println(number + " is Not Prime number");
        }

        input.close();
    }
}
