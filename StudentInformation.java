
package student.information;
import java.util.Scanner;

public class StudentInformation {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter your name:");
        String name = input. nextLine();
         System.out.print ("Enter your Student Id:");
         int id=input.nextInt();
          System.out.print ("Enter your Department:");
           String dep = input .nextLine();
           input.nextLine();
         System.out.print ("Enter your CGPA:");
         double cgpa=input.nextDouble();
         System.out.println ("name:"+name);
         System.out.println ("id:"+id);
         System.out.print("department:\n"+dep);
         System.out.println ("CGPA:"+cgpa);
         
         
        
    }
    
}
