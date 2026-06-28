package primenumber;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is Not a Prime number");
        }
    }
}

    
