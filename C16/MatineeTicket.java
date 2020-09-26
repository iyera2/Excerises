import java.util.Scanner;

public class MatineeTicket{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        double age, hour;

        System.out.println("Enter your current age: ");
        age = scan.nextDouble();
        System.out.println("Enter the current time in Military Standard: ");
        hour = scan.nextDouble();

        if(age <= 13 && hour == 1700){
            System.out.println("The child matinee price is $2.00");
        } else if(age <= 13){
            System.out.println("The child price is $4.00");
        } else if( age > 13 && hour == 1700){
            System.out.println("The adult matinee price is $5.00");
        } else if(age > 13 && hour > 2200){
            System.out.println("The adult price is $8.00");
        } else if(age > 13){
            System.out.println("The adult price is $4.00");
        }
    }
}