package student.management;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Department: ");
        String department = input.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = input.nextDouble();
        System.out.println(" Student Information ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        input.close();
    }
}
