import java.util.Scanner;
public class Grade {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String stdName = scanner.nextLine();

        System.out.print("Enter your score : ");
        int score = scanner.nextInt();

        String grade = "";
 
        if(score >= 80 ){

            grade = "A";

        }else if(score >= 70){

            grade = "B";

        }else if(score >= 60){

            grade = "C";

        }else if(score >= 50){

            grade = "D";  

        }else{

            grade = "E";
        }
       
        System.out.println("-----result-----");
        System.out.println("Name : " + stdName);
        System.out.println("Score : " + score);
        System.out.println("Grade : "+ grade);
    }
}    