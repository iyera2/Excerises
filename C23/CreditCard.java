import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.*;

public class CreditCard{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monthly, month, i = 0;
        double interest, finalNum = 0;
        DecimalFormat numform = new DecimalFormat();

        System.out.println("Enter the Beginning Balance: ");
        month = scan.nextInt();
        System.out.println("Enter the Monthly Payments: ");
        monthly = scan.nextInt();
        System.out.println("Enter the Monthly Interest: ");
        interest = scan.nextDouble();
        
        while(month > 0){
            month += month * interest;
            if((month - monthly) > 0){
                month -= monthly;
                finalNum += monthly;
            } else {
                finalNum += month;
                month -= month;
            }
            System.out.println("Month: " + (i+1) + "\tbalance " + numform.format(month)
            + "\t\t\ttotal payments: " + finalNum);
            i++;
        }
    }
}

