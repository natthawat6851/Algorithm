import java.util.Scanner;
public class TwoWayDecision {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = scanner.nextInt();

        if(number%2 == 0 ){
            System.out.println("The number "+number+" is even");  
        }else{
            System.out.println("The number "+number+" is odd");
        }
        System.out.println("จบโปรแกรม");

    }

}