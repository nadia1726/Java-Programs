package temperatureconvert;
import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature In Celsius: ");
        double cels = input.nextDouble();
        double farn = (1.8 * cels) + 32;
        System.out.println("Temperature in Fahrenheit = " + farn);
        System.out.print("Enter Temperature In Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9; 
        System.out.println("Temperature in Celsius = " + celsius);
        input.close(); 
    }
}

