import java.util.Scanner;

public class MemberShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Membership Level(Silver,Gold,Platinum) : ");
        String mbsLevel = scanner.nextLine();

        System.out.print("Enter Total Purchase Amount : ");
        double totalPrice = scanner.nextDouble();
        
        double netPrice = 0;
        double discount = 0; 

        if(mbsLevel.equals("Silver")){

            netPrice = totalPrice*0.95;
            discount = totalPrice*0.05;

        }else if(mbsLevel.equals("Gold")){

            netPrice = totalPrice*0.90;
            discount = totalPrice*0.10;

        }else if(mbsLevel.equals("Platinum")) {

            netPrice = totalPrice*0.85;
            discount = totalPrice*0.15;

        }else{

            netPrice = totalPrice*1;
            discount = totalPrice*0;

        }
        
        System.out.println("|----------------------------------------------------|"+"\n"+"Membership Level : "+mbsLevel);
        System.out.println("Total Purchase : "+totalPrice);
        System.out.println("Discount : "+discount);
        System.out.println("Final Price : "+netPrice);
    }
    
}
