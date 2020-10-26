import java.util.Scanner;

public class SumSeq{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum, new_sum = 0;

        System.out.println("Enter N:");
        n = scan.nextInt();

        sum = (n*(n+1))/2;

        while(n > 0){
            new_sum = new_sum + n;
            n--;
        }
        System.out.println("Formula Sum = " + sum);
        System.out.println("Loop Sum = " + new_sum);
    }
}