import java.util.Scanner;
public class Area {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();

        double area = 3.14*r*r;
        System.out.println("Area of circle is "+area);
    }
}