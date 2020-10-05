import java.util.Scanner;

public class MicroHeating{
    public static void main(String[] args) {
        int item;
        double time;

        Scanner scan = new Scanner( System.in );
        System.out.println("How many items to heat: ");
        item = scan.nextInt();
        System.out.println("Time for one item in seconds: ");
        time = scan.nextDouble();

        if(item == 2){
            time = (double) ((time) * 0.5);
        } else if(item == 3){
            time = (time) * 3;
        } else if (item > 3){
            time = 0;
        } else {
            time = time;
        }

       Double sec;

        int min = (int) (time / 60);
        if(min == 0){
            sec = time;
            System.out.println("Heat for " + min + " minutes " + sec + " seconds ");
        } else if (min > 0) {
            sec = (time - 60 * (min));
            System.out.println("Heat for " + min + " minutes " + sec + " seconds ");
        }
        
    }
}