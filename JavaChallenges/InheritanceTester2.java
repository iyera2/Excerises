import java.util.Scanner;

public class InheritanceTester2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lastname, firstname, dept;
        double pay_rate;
        int hrs;

        InheritanceClass4 prof = new InheritanceClass4("Bob", "Wood", 25.0, 50, "COSC");

        InheritanceClass4 newEmp = new InheritanceClass4();

        prof.printRegular();
        prof.printReverse();;
        newEmp.print();
        newEmp.printRegular();

        newEmp.setAll("Tim", "Cook", 60, 20, "CEO");
        newEmp.printRegular();
        newEmp.printReverse();;

        System.out.println("copying the prof to emp");
        newEmp.copy(prof);

        System.out.println("Are they equal now");
        System.out.println(newEmp.equals(prof));
    }
}