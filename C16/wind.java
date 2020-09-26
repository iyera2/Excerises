import java.util.Scanner;
import java.lang.Math;

public class wind{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        double speed, temp;

        System.out.println("Enter Wind Speed:");
        speed = scan.nextDouble();
        System.out.println("Enter Temperature");
        temp = scan.nextDouble();

        if(speed < 3){
            System.out.println("Wind Chill: " + temp);
        } else if(temp > 50){
            System.out.println("Wind Chill: " + temp);
        } else {
            Double expo = Math.pow(speed, 0.16);
            Double wind_chill = 35.74 + 0.6125*temp - 35.75*expo + 0.4275*temp*expo;
            System.out.println("Wind Chill: " + wind_chill);
        }
    }
}