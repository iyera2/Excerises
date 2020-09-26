import java.util.Scanner;

public class order{
   public static void main(String[] args) {
       double bolts = 5;
       double nuts = 3;
       double washer = 1;

       Scanner scan = new Scanner( System.in );
       double new_bolts, new_nuts, new_washer;

       System.out.println("Enter the amount of bolts:");
       new_bolts = scan.nextDouble();
       System.out.println("Enter the amount of nuts");
       new_nuts = scan.nextDouble();
       System.out.println("Enter the amount of washers");
       new_washer = scan.nextDouble();

       double bots = (new_bolts * 2);

       if(new_nuts == new_bolts && new_washer >= new_bolts){
        System.out.println("Correct Order");
       } else if(new_nuts < new_bolts){
        System.out.println("Check the Order: too few nuts");
       } else if(new_bolts < new_nuts){
           System.out.println("Check the order: too few bolts");
       }

       if(new_washer < bots){
        System.out.println("Check the order: too few washers");
       } else{

       }

       System.out.println("Total cost: " + ((bolts*new_bolts) + (nuts*new_nuts) + (washer*new_washer)));
   }

}