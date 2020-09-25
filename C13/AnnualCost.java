import java.util.Scanner;

public class AnnualCost{
    public static void main(String[] args) {
        double cents, year;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cost per kilowatt-hour in cents:");
        cents = scan.nextDouble();

        System.out.println("Enter kilowatt-hours per year:");
        year = scan.nextDouble();

        Double annual = (cents*year)*(.01);
        System.out.println(annual);

    }
}