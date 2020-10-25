import java.util.Scanner;

public class harmonic{
    public static void main(String[] args) {

        //Resistance to change

        double x, y;
        Scanner scan = new Scanner( System. in);

        System.out.println("Enter X:");
        x = scan.nextInt();

        System.out.println("Enter Y:");
        y = scan.nextInt();

        Double arthmetic = (x+y)/2;
        Double harmonic = 2/(1/x + 1/y);
        
        System.out.println("Arithmetic mean: " + arthmetic);
        System.out.println("Harmonic mean: " + harmonic);
    }
}