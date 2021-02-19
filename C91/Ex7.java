import java.util.Scanner;

public class Ex7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Triangle #: ");
        int number = scan.nextInt();
        if(number < 0){
            System.out.println("Triangle #: ");
            number = scan.nextInt();
        }
        scan.close();
        System.out.println("Triangle is " + Triangle(number));
    }

    public static int Triangle(int N){
        if(N == 1){
            return 1;
        } else {
            return N + Triangle(N-1);
        }
    }
}