import java.util.Scanner;

public class FantasyGame{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        int strength, health, luck;
        String character;

        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of the character:");
        character= scan.next();
        System.out.println("Enter strength:");
        strength = scan.nextInt();
        System.out.println("Enter health:");
        health = scan.nextInt();
        System.out.println("Enter luck:");
        luck = scan.nextInt();
        int total = strength+health+luck;

        if(total > 15){
            strength = 5;
            health = 5;
            luck = 5;
            System.out.println("You have give your character too many points!Default values have been assigned: " + character + strength + health + luck);
        } else{
            System.out.println("You character is good to go.");
        }
    }
}