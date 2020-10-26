import java.util.Scanner;

public class JetLag{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double hours, depart, arrive, daysRecovery;
        int zones;

        System.out.println("Hours Traveled: ");
        hours  = scan.nextDouble();

        System.out.println("Time Zones Crossed: ");
        zones  = scan.nextInt();

        System.out.println("Depart: ");
        depart  = scan.nextDouble();

        System.out.println("Arrive: ");
        arrive  = scan.nextDouble();

        System.out.println(depart);
        System.out.println(arrive);
        
        daysRecovery = (hours/2.0 + (zones - 3) + depart + arrive)/ 10.0;
        System.out.println("You need " + daysOfRecovery + " days to recover");
    }
}