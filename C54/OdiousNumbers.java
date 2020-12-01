import java.util.Scanner;

public class OdiousNumbers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter");
        long num = scan.nextLong();

        System.out.println(isOdious(num));

    }

    public static boolean isOdious(long num){
        long total = 1;
        int count = 0;
        while(num / 2 != 0){
            long num2 = num % 2;
            total += num2;
            num = num / 2;
        }
        if(total % 2 == 1){
            System.out.println("Odious");
            return true;
        } else {
            System.out.println("Evil");
            return false;
        }
    }
}