import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in celsius : ");
        double temperature = scanner.nextDouble();
        String status = "";

        if(temperature > 35) {

            status = "Hot!!!";

        }else if(temperature >= 20 ) {

            status = "Normal";

        }else{

            status = "Cold!!!";

        }
   
        System.out.println("Temperature : " + temperature);
        System.out.println("Status : " +status);
   
    }

    
}
