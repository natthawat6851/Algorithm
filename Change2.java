import java.util.Scanner;
public class Change2 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Price of Product :");
        int productPrice = scanner.nextInt();

        System.out.print("Quantity for product : ");
        int quantity = scanner.nextInt();

        System.out.print("money for pay : ");
        int money = scanner.nextInt();

        int price = productPrice*quantity;

        if (money >= price) {
            int change = money - price;
            System.out.println("Change is "+change+" baht" );

            int fiveHundred = change / 500;
            change = change % 500;
            System.out.println("Five-Hundred note "+fiveHundred+" note(s)");
            int hundred = change/100;
            change = change%100;
            System.out.println("Hundred note "+hundred+" note(s)");
            int fifty = change/50; 
            change = change%50;
            System.out.println("Fifty note "+fifty+" note(s)");
            int twenty = change/20;
            change = change%20;
            System.out.println("Twenty note "+twenty+" note(s)");
            int ten = change/10;
            change = change%10;
            System.out.println("Ten coin "+ten+" coin(s)");
            int five = change/5;
            change = change%5;
            System.out.println("Five coin "+five+" coin(s)");
            int two = change/2;
            change =change%2;
            System.out.println("Two coin "+two+" coin(s)");
            System.out.println("One coin "+change+" coin(s)");
            
        }else{

             System.out.println("Not enough money!!!!!");

        }

    }
    
}
