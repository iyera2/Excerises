import java.util.Scanner;

public class PowerNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double X, power = 0;
        int N;

        System.out.println("Enter X: ");
        X = scan.nextDouble();
        System.out.println("Enter N: ");
        N = scan.nextInt();
        
        if(N < 0){
            System.out.println("N must be a postive number");
        } else{
            power += Math.pow(X, N);
            System.out.println(X + " raised to the power " + N + " is: " + power);
        }
        
    }
}