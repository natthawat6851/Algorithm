import java.util.Scanner;
public class Score {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your midterm score : ");
        int midtermScore = scanner.nextInt();

        System.out.print("Enter your finalterm score : ");
        int finaltermScore = scanner.nextInt();

        int sumOfScore = midtermScore + finaltermScore;

        if(sumOfScore < 50){
            System.out.println("Your total score is "+sumOfScore+". The result is Fail!!");
        }else{
            System.out.println("Your total score is "+sumOfScore+". The result is pass!!");
        }

        System.out.println("จบโปรแกรม");
    }
}    