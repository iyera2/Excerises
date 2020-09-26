import java.util.Scanner;

public class weight{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        double wet;

        System.out.println("What is your weight:");
        wet = scan.nextDouble();

        if(wet >= 30 && wet <= 250 ){
            System.out.println("You are allowed to enter");
        } else{
            System.out.println("Sorry you cannot enter due to weight");
        }
    }
}