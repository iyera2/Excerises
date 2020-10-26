import java.util.Scanner;

public class RangeInt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int low,high, new_sum = 0;
        double sum;

        System.out.println("Enter low: ");
        low = scan.nextInt();
        System.out.println("Enter high: ");
        high = scan.nextInt();

        sum = (high*(high+1.0))/2.0 - (low*(low+1.0))/2.0 + low;

        while(high >= low){
            new_sum = new_sum + high;
            high--;
        }
        System.out.println("Formula sum is " + sum);
        System.out.println("Loop sum is " + new_sum);
    }
}