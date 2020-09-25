import java.util.Scanner;

public class log{
    public static void main(String[] args) {
        double lg;
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter a double:");
        lg = scan.nextDouble();

        double math = (Math.log(lg)/ Math.log(2));

        System.out.println("Base 2 log of " + lg + " is " + math);
    }
}