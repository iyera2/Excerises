import java.util.Scanner;

public class DrugPotency{
    public static void main(String[] args) {
        int month = 0;
        double effecness = 100; //too lazy to type out the entire word.
        while(effecness > 50){
            System.out.print(" Month" + month + "Effectiveness: " + effecness);
            month++;
            effecness += 0.96;
        }
        System.out.println("Month " + month + "Effectiveness: " + effecness + " DISCARDED");
    }
}