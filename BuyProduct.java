import java.util.Scanner;
public class BuyProduct {
    public static void main(String []args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Product #1 name : ");
        String product1 = scanner.nextLine();

        System.out.print("Product #1 price : ");
        float productPrice1 = scanner.nextFloat();

        System.out.print("Quantity for product #1 : ");
        float quantityForProduct1 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Product #2 name : ");
        String product2 = scanner.nextLine();

        System.out.print("Product #2 price : ");
        float productPrice2 = scanner.nextFloat();

        System.out.print("Quantity for product #2 : ");
        float quantityForProduct2 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Product #3 name : ");
        String product3 = scanner.nextLine();

        System.out.print("Product #3 price : ");
        float productPrice3 = scanner.nextFloat();

        System.out.print("Quantity for product #3 : ");
        float quantityForProduct3 = scanner.nextFloat();

        System.out.print("Total paid : ");
        float totalPaid = scanner.nextFloat();

        float sumOfPrice1 = productPrice1 * quantityForProduct1;
        float sumOfPrice2 = productPrice2 * quantityForProduct2;
        float sumOfPrice3 = productPrice3 * quantityForProduct3;
        float totalPrice = sumOfPrice1 + sumOfPrice2 + sumOfPrice3;
        float tax = totalPrice*0.07f;
        float netPrice = totalPrice + tax;
        float change = netPrice - totalPaid;
        System.out.println("--- Receipt ---");
        System.out.println(product1+" : "+productPrice1+"\n"+product2+" : "+productPrice2+"\n"+product3+" : "+productPrice3+"\n"+"Total price before tax : "+totalPrice+"\n"+"VAT : "+tax+"\n"+"Net price : "+netPrice+"\n"+"Total paid : "+totalPaid+"\n"+"change : "+change);
    }
}