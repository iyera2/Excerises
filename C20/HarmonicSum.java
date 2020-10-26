import java.util.Scanner;

public class HarmonicSum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double sum = 0;

        System.out.println("Enter N: ");
        n = scan.nextInt();

        while(n > 0){
            sum = sum + 1.0/n;
            n--;
        }
        System.out.println("The Sum is " + sum);
    }
}