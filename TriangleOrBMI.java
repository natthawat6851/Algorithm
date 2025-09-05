import java.util.Scanner;
public class TriangleOrBMI {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = scanner.nextInt();

        if(number == 1 ){
            System.out.print("Enter base: ");
            float base = scanner.nextFloat();

            System.out.print("Enter heigh: ");
            float heighOfTrigle = scanner.nextFloat();

            float area = (1/2f)*base*heighOfTrigle;
            System.out.println("Area of Triangle is "+area);
        }if(number == 2) {
            System.out.print("Enter weight : " );
            float weight = scanner.nextFloat();

            System.out.print("Enter height : " );
            float heightOfBody = scanner.nextFloat();

            float BMI = weight/(heightOfBody*heightOfBody);
            System.out.println("Your BMI for weight = "+weight+" kg and height = "+heightOfBody+" meter is : "+BMI+" bmi.");
        }if(number != 1){
            if(number != 2){
                System.out.println("number is error");
            }   
        }
        System.out.println("จบโปรแกรม");

    }

}