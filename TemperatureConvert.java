
package temperatureconvert;
import java. util.Scanner; 

public class TemperatureConvert {

   
    public static void main(String[] args) {
        System.out.print("Enter Temperature In Celsius :");
       Scanner input = new Scanner (System.in);
       double cels= input.nextDouble();
       double farn=(1.8*cels)+32;
       System.out.println("Temperature in Fahrenheit="+farn);
      
       System.out.print("Enter Temperature In Fahrenheit: ");
        double fahrenheit= input.nextDouble();
       double celsius=0.555555*(fahrenheit-32);
        System.out.println("Temperature in Celsius="+celsius);
       
    }
    
}
