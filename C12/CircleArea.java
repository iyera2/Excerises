import java.util.Scanner;
import java.lang.Math;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        
        double radius;
        double area;

        System.out.println("Enter the radius:");
        radius = scan.nextInt();

        area = (Math.PI * radius * radius);

        System.out.println("The radius is" + radius);
        System.out.println("The area is" + area);
    }
}