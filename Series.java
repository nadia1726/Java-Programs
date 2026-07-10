
package series;
import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        System.out.print("enter the first number :");
        Scanner input = new Scanner(System.in);
          int m= input.nextInt();
        int sum=0;
        System.out.print("enter the last number :");
        int n= input.nextInt();
        for (int i = m; i <= n; i=i+3) {
            System.out.print(i+ "  ");
            sum=sum+i;
           
        }
        System.out.println();
        System.out.println("sum = " + sum);
        
    }
    
}
