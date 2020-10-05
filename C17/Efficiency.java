import java.util.Scanner;

public class Efficiency{
    public static void main(String[] args) {
        Double tair, tsteam;
        Scanner scan = new Scanner( System.in );
        System.out.println("What is the air temp in Kelvin");
        tair = scan.nextDouble();
        System.out.println("What is the steam temp in Kelvin");
        tsteam = scan.nextDouble();

        double efficiency;

        if(tsteam < 373){
            efficiency = 0;
        } else{
            efficiency = 1- tair/tsteam;
        }

        System.out.println("The efficiency is " + efficiency);
    }
}