
package multiplicationtable;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for (int i = 1; i <=10; i++) {
            int timesofTable=n*i;
            System.out.println( n+ "*" +i+"=" +timesofTable);
        }
       
    }
    
}
