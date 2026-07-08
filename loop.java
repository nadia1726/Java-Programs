package loop;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for (int i = 0; i <= x; i++) {
            System.out.println("bangladesh");
        }

        input.close();
    }
}