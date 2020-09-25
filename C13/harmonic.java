import java.util.Scanner;

public class harmonic{
    public static void main(String[] args) {
        double x, y;
        Scanner scan = new Scanner( System. in);

        System.out.println("Enter X:");
        x = scan.nextDouble();

        System.out.println("Enter Y:");
        y = scan.nextDouble();

        Double arthmetic = (x+y)/2;
        Double harmonic = 2/(1/x + 1/y);
        
        System.out.println("Arithmetic mean: " + arthmetic);
        System.out.println("Harmonic mean: " + harmonic);
    }
}