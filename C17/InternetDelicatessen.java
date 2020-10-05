import java.util.Scanner;

public class InternetDelicatessen{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        String item;
        Double price, overnight;

        System.out.println("Enter the item: ");
        item = scan.next();
        System.out.println("Enter the price: ");
        price = scan.nextDouble();
        System.out.println("Overnight delivery (0==no, 1==yes): ");
        overnight = scan.nextDouble();

        System.out.println("Invoice:");
        System.out.println(     item  + price);
        double delivery = 0;

        if(price < 10 && overnight == 1){
            delivery = delivery + 2 + 3;
            System.out.println(  "delivery " + delivery);
        } else if(price < 10 && overnight == 0){
            delivery = delivery + 2;
            System.out.println(   "delivery " + delivery);
        } else if(price >= 10 && overnight == 1){
            delivery = delivery + 3;
            System.out.println(    "delivery " + delivery);
        } else if(price >= 10 && overnight == 0){
            System.out.println(    "delivery " + delivery);
        }

        double total = price + delivery;
        System.out.println(     "total  " + total);
    }
}