import java.util.Scanner;

public class TownDump{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        int pounds;

        System.out.println("What is your pounds of trash:");
        pounds = scan.nextInt();

        int n = (pounds - 200)/100;

        int price = 20;
        if(pounds == 200){
            price = price;
        } else if(pounds > 200){
            price = price + 8*n;
        } else if(pounds < 200){
            price = price;
        }

        System.out.println("You have " + pounds + " pounds and it costs $" + price);
    }
}