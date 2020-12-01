import java.util.Scanner;

public class Unlucky{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter");
        long num = scan.nextLong();

        System.out.println(isUnluckly(num));

    }

    public static boolean isUnluckly(long num){
        long total = 1;
        long check = 0;
        while(num / 10 != 0){
            long num2 = num % 10;
            check = (num/10) % 10;
            num = num / 10;
            if(num2 == 3 && check == 1){
                System.out.println("Unluckly");
                return true;
            }
        
        }
        return false;
      
    }
}