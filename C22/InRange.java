import java.util.Scanner;

public class InRange{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int low, high, data, sum = 0, other_sum = 0;
        boolean bool = true;

        System.out.println("Low end of range: ");
        low = scan.nextInt();
        System.out.println("High end of range: ");
        high = scan.nextInt();

        while(bool = true){
            System.out.println("Enter data: ");
            data = scan.nextInt();
            if(data == 0){
                break;
            }
            if(data >= low && data <= high){
                sum += data;
            } else{
                other_sum += data;
            }
        }
        System.out.println("Sum of in range values: " + sum);
        System.out.println("Sum of out of range values: " + other_sum);
    }
}