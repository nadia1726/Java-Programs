package reverse.a.number;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0, temp, rem;
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;

        }
        if (num==sum){
            System.out.println(num+ " palindrom");
        }
        else{
        System.out.println(num+"  not palindrom " );
    }

}
}
