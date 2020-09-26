import java.util.Scanner;

public class LastGas{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        double capacity, reading, mpg;

        System.out.println("Enter Tank capcity:");
        capacity = scan.nextDouble();
        System.out.println("Enter Gage Reading in Percentage:");
        reading = scan.nextDouble();
        System.out.println("Enter Miles per gallon:");
        mpg = scan.nextDouble();

        Double decimal = reading * .10;
        Double total = ((capacity * mpg)/decimal);
        if(total < 200){
            System.out.println("Get Gas!");
        } else{
            System.out.println("Safe to Drive");
        }
    }
}