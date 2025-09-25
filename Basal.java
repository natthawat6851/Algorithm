import java.util.Scanner;

public class Basal {
    public static void main(String arg[]){
         Scanner sc=new Scanner(System.in); 

         System.out.print("Enter your height: ");
         double height = sc.nextDouble();

         System.out.print("Enter your weight: ");
         double weight = sc.nextDouble();

         System.out.print("Enter your age: ");
         double age = sc.nextDouble();

         System.out.print("Enter your sex (m/f): "); 
         char sex=sc.next().charAt(0);

         if(sex=='m'){
            double bmr = 66+(13.7* weight)+(5* height)-(6.8*age) ;

            System.out.println("your BMR: "+bmr);

        }if else(sex == 'f'){
             double bmr = 655+(9.6* weight)+(1.8* height)-(4.7*age);

            System.out.println("your BMR: "+bmr);
        }else{}
    }

}
