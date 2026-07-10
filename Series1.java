
package series1;
import java.util.Scanner;
public class Series1 {
    public static void main(String[] args) {
        System.out.print("enter the first number :");
        Scanner input = new Scanner(System.in);
        int m= input.nextInt();
       int multiply=1;
        System.out.print("enter the last number :");
      int n= input.nextInt();
        for (int i = m; i <= n;i++) {
            System.out.print(i+ "  ");
            multiply=multiply*i;
           
        }
        System.out.println();
        System.out.println("multiply = " + multiply);
        
    }
    
}
