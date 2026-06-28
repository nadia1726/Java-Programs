package primenumber;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println(number + (count == 2 ? " is Prime number" : " is Not Prime number"));

        input.close();
    }
}
