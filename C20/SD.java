import java.util.Scanner;

public class SD{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integer, i = 1;
        double new_int, sum = 0;
        double new_multi = 0;

        System.out.println("How many integers will be added: ");
        integer = scan.nextInt();

        while(i <= integer){
            System.out.println("Enter an integer: ");
            new_int = scan.nextDouble();
            i++;
            new_multi = new_multi + new_int * new_int;
            sum = sum + new_int;
        }
        double avg = sum/integer;
        double avgSquare = avg * avg;
        double new_avg = new_multi/integer;
        double SD = Math.sqrt(new_avg - avgSquare);
        System.out.println("The average weight is " + avg);
        System.out.println("The standard deviation is " + SD);
    }
}