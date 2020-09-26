import java.util.Scanner;

public class AgetoSec{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        double years, months, days;

        System.out.println("Enter the number of years:");
        years = scan.nextDouble();
        System.out.println("Enter the number of months:");
        months = scan.nextDouble();
        System.out.println("Enter the number of days:");
        days = scan.nextDouble();

        Double new_years = years * 3.15e+7;
        Double new_months = months * 2.62e+6;
        Double new_days = days * 86400;
        Double total = new_years + new_months + new_days;
        Double lifespan = ((total)/((2.5E9))) * 100;
        System.out.println("The number of seconds in your age is " + total);
        System.out.println("The lifespan is " + lifespan + " percent");
    }
}