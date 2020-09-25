import java.util.Scanner;
public class correctchange{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        int cents;

        System.out.println("Enter your cents:");
        cents = scan.nextInt();

        int dollars = (cents - 100);
        int dollars2 = (cents / 100);
        int cents2 = (cents - (100 * dollars2));
        if (dollars2 >= 2){  
            System.out.println(dollars2 + " dollars fits into " + cents + " cents leaving " + cents2 + " cents");
        } else if (dollars2 >= 1 && dollars2 < 2) {
            System.out.println("One dollars fit into " + cents + " cents leaving " + dollars + " cents");
        } else {
            System.out.println("One dollars doesn't fit into " + cents + " cents");
        }

        int quarters = (cents2 - 25);
        int quarters2 = (cents2 / 25);
        int quarters3 = (cents2 - (25 * quarters2));
        if (quarters >= 2){
            System.out.println(quarters2 + " quarter fits into " + cents2 + " cents leaving " + quarters3 + " cents");
        } else if (quarters2 >= 1 && quarters2 < 2){
            System.out.println("One quarter fit into " + cents2 + " cents leaving " + quarters + " cents");
        } else {
            System.out.println("One quarter doesn't fit into " + cents2 + " cents");
        }

        int dimes = (quarters3 - 10);
        int dimes2 = (quarter)



    }
}