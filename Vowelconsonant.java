package Vowelconsonent;

import java.util.Scanner;

public class Vowelconsonant {
    
    public static void main(String[] args) {
        System.out.print("Enter a letter: ");
        Scanner input = new Scanner(System.in);
        
        char ch = input.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Consonant");
        } else {
            System.out.println("Not an alphabet");
        }
        
        input.close();
    }
}
