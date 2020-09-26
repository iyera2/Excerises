import java.util.Scanner;

public class discount{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        double dis;

        System.out.println("Enter amount of purchases");
        dis = scan.nextDouble();

        if(dis > 10){
            Double ten = dis * .1;
            Double price = dis - ten;
            System.out.println("Discounted price: " + price);
        } else{
            System.out.println("No discount. Price is " + dis);
        }
    }
}