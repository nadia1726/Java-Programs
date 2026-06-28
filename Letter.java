
package letter;
import java.util.Scanner;

public class Letter {

    
    public static void main(String[] args) {
        System.out.print("Enter any letter:");
        Scanner input= new Scanner(System.in);
        char ch = input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
          System.out.println("small letter");  
        }
        else if(ch>='A'&&ch<='Z'){
            System.out.println("capital letter");
        }
        else {
            System.out.println("invalid letter");
        }
        
    }
    
}
