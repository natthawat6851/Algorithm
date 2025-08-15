import java.util.Scanner;
public class BodySurfaceArea {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width : ");
        float width = scanner.nextFloat();

        System.out.print("Enter length : ");
        float length = scanner.nextFloat();
        
        float Area = (width*length)/360;
        System.out.println("Body surface area is "+Area);
    }
}