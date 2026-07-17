package assignment.pkg13;

import java.util.Scanner;

public class Sumofdigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }

        System.out.println(sum);

        input.close();
    }
}