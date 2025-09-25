import java.util.Scanner;
public class Grade3 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your midterm score : ");
        int midtermScore = scanner.nextInt();

        System.out.print("Enter your finalterm score : ");
        int finaltermScore = scanner.nextInt();

        int sumOfScore = midtermScore + finaltermScore;

        if(sumOfScore >= 80 ){
            System.out.println("4");
        }else if(sumOfScore >= 75){
            System.out.println("3.5");
        }else if(sumOfScore >= 70){
            System.out.println("3");
        }else if(sumOfScore >= 65){
            System.out.println("2.5");            
        }else if(sumOfScore >= 60){
            System.out.println("2");
        }else if(sumOfScore >= 55){
            System.out.println("1.5");
        }else if(sumOfScore >= 50){
            System.out.println("1");
        }else{
            System.out.print("มึงสอบตก!!!!โง่จริงๆ!!!!! ไอ้ "+name+" ไอควายเอ้ย");
        }

        System.out.println("จบโปรแกรม");
    }
}    