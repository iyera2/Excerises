import java.util.Scanner;

public class MilesGallon{
    public static void main(String[] args) {
        int miles = 0, final_miles, gallons;
        double new_miles;
        boolean bool = true;
        Scanner scan = new Scanner(System.in);


        while(bool = true){
            System.out.println("Initial miles: ");
            miles = scan.nextInt();

            if(miles < 0){
                System.out.println("Bye, Have a good day");
                break;
            }
            System.out.println("Final miles: ");
            final_miles = scan.nextInt();
            System.out.println("Gallons: ");
            gallons = scan.nextInt();
            new_miles = (double)(final_miles - miles)/gallons;
            System.out.println("Miles per gallon: " + new_miles);
        }
    }
}