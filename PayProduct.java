import java.util.Scanner;

public class PayProduct {
     public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your product price: ");
        int productPrice = scanner.nextInt();

         System.out.print("Enter your quantity: ");
        int quantity = scanner.nextInt();

        
        if(quantity > 10){
            double payProduct  = (quantity*productPrice)*0.9 ;
            System.out.println("Total price : "+payProduct);
        }
        else{
            double payProduct  = quantity*productPrice ;
             System.out.println("Total price : "+payProduct);
        }
    }
}

