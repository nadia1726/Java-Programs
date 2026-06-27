
package primenumber;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner input=new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 !=0){
            System.out.print("Prime number"+number);}
            else {
                   System.out.println(" Not Prime number"+number); 
                    }
            
        }
    }
    

