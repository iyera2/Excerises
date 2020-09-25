import java.util.Scanner;

public class distance{
    public static void main(String[] args) {
        double seconds;
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter the number of seconds:");
        seconds = scan.nextDouble();
        Double d = .5 *(32.174) * (seconds * seconds);
        System.out.println("Distance: " + d);
    }
}