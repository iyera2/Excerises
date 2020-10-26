import java.util.Scanner;

public class WedgeStars{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.println("Inital number of stars: ");
        number = scan.nextInt();

        while(number > 0){
            int i =0;
            while(i < number){
                System.out.println("*");
                i++;
            }
            System.out.println();
            number--;
        }
    }
}