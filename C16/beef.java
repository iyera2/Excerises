import java.util.Scanner;

public class beef{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        double pacA, leanA, pacB, leanB; //Variables names aren't the best maybe slightly confusing

        System.out.println("Price per pound package A:");
        pacA = scan.nextDouble();
        System.out.println("Percent lean package A:");
        leanA = scan.nextDouble();
        System.out.println("Price per pound package B:");
        pacB = scan.nextDouble();
        System.out.println("Percent lean package B:");
        leanB = scan.nextDouble();

        Double new_leanA = (pacA/(leanA*.01));
        Double new_leanB = (pacB/(leanB*.01));

        System.out.println("Package A cost per pound of lean: " + new_leanA);
        System.out.println("Package B cost per pound of lean: " + new_leanB);
        if(new_leanA < new_leanB){
            System.out.println("Package A is the best value");
        } else {
            System.out.println("Package B is the best value");
        }
    }
}