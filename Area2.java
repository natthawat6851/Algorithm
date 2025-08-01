import java.util.Scanner;
public class Area2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        float base = scanner.nextFloat();

        System.out.print("Enter high: ");
        float high = scanner.nextFloat();

        System.out.print("Enter side: ");
        float side = scanner.nextFloat();

        float areaOfTriangle = (1/2f)*base*high;
        float areaOfSquare = side*side;
        System.out.println("Area of Triangle is "+areaOfTriangle);
        System.out.println("Area of Square is "+areaOfSquare);
    }
}