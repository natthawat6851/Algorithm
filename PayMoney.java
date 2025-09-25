import java.util.Scanner;
public class PayMoney {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(&quot;Price of one dress : &quot;);
        double priceOfDress = scanner.nextDouble();
        System.out.print(&quot;Number of dresses to buy : &quot;);
        double numOfDresses = scanner.nextDouble();
        System.out.print(&quot;Discount rate :&quot;);
        double discountRate = scanner.nextDouble();
        double totalCost = priceOfDress*numOfDresses;
        double discountAmount = totalCost*(discountRate/100);
        double netPay = totalCost-discountAmount;
        System.out.println(&quot;Total cost : &quot;+totalCost+&quot;\n&quot;+&quot;Discount amout :
&quot;+discountAmount+&quot;\n&quot;+&quot;Net pay : &quot;+netPay);
        }

    }
}