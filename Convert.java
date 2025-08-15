import java.util.Scanner;
public class Convert {
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter fahrenheit : ");
    float fahrenheit = scanner.nextFloat(); 

    float celcius = (5.0f/9.0f)*(fahrenheit-32f);
    System.out.println(fahrenheit+"degrees Fahrenheit is equal to "+celcius+" degrees Celsius.");

    }
}