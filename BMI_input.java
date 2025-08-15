import java.util.Scanner;
public class BMI_input {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight : " );
        float weight = scanner.nextFloat();

        System.out.print("Enter height : " );
        float height = scanner.nextFloat();

        float BMI = weight/(height*height);
        System.out.println("Your BMI for weight = "+weight+" kg and height = "+height+" meter is : "+BMI+" bmi.");
    }
}