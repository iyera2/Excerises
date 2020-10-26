import java.util.Scanner;

public class AddInt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integer, i = 1;
        int new_int, sum = 0;

        System.out.println("How many integers will be added: ");
        integer = scan.nextInt();

        while(i <= integer){
            System.out.println("Enter an integer: ");
            new_int = scan.nextInt();
            i++;
            sum = sum + new_int;
        }
        System.out.println("The sum is " + sum);
    }
}