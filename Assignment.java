
package assignment;
import java. util.Scanner;
public class Assignment {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your phone price:");
        int phone_price= input.nextInt();
         System.out.print("Enter Your Number Of Installment:");
        int numberOfInstallment= input.nextInt();
        int installmentPerMonth= (phone_price/numberOfInstallment);
        System.out.println("Installment PerMonth="+installmentPerMonth);
    }
    
}
