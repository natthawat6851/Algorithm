import java.util.Scanner;
public class BuyProduct {
    public static void main(String []args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Product #1 name : ");
        float product1 = scanner.nextFloat();

        System.out.print("Product #1 price : ");
        float productPrice1 = scanner.nextFloat();

        System.out.print("Product #2 name : ");
        float product2 = scanner.nextFloat();

        System.out.print("Product #2 price : ");
        float productPrice2 = scanner.nextFloat();

        System.out.print("Product #3 name : ");
        float product3 = scanner.nextFloat();

        System.out.print("Product #3 price : ");
        float productPrice3 = scanner.nextFloat();

        System.out.print("Total paid : ");
        float totalPaid = scanner.nextFloat();

        float totalPrice = productPrice1 + productPrice2 + productPrice3;
        float tax = totalPrice*0.07f;
        float netPrice = totalPrice + tax;
        float change = netPrice - totalPaid;
        System.out.println(product1+" : "+productPrice1+"\n"+product2+" : "+productPrice2+"\n"+product3+" : "+productPrice3+"\n"+"Total price before tax : "+totalPrice+"\n"+"VAT : "+tax+"\n"+"Net price : "+netPrice+"\n"+"Total paid : "+totalPaid+"change : "+change);
    }
}