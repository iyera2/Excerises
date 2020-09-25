import java.util.Scanner;

public class dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        int cent;

        System.out.println("Input the cents:");
        cent = scan.nextInt();

        double Dollars = cent * .01;

        System.out.println("That is " + Dollars + " dollars and " + cent + " cents");
    }
}