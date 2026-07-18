
package palindrome;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Entre any  positive number");
        Scanner input = new Scanner(System.in);
        int num, rev=0,temp,rem;
        num= input.nextInt();
        temp=num;
        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println(num+" is palindrome");
        }
        else{
            System.out.println(num+"is not palindrome");
        }
        
        
    }
    
}
