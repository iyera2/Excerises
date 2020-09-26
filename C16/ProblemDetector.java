import java.util.Scanner;

public class ProblemDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        double birth, year;

        System.out.println("Year of Birth:");
        birth = scan.nextDouble();
        System.out.println("Current year:");
        year = scan.nextDouble();

        if(birth >= 00 && birth <= 20 && year >= 00 && year <= 20){
            Double new_birth = birth + 2000;
            Double new_year = year + 2000;
            Double age = (new_year - new_birth);
            System.out.println("Your age: " + age);
        } else if (birth >= 21 && birth <= 99 && year >= 00 && year <= 20) {
            Double new_birth = birth + 1900;
            Double new_year = year + 2000;
            Double age = (new_year - new_birth);
            System.out.println("Your age: " + age);
        } else if (birth >= 00 && birth <= 20 && year >= 21 && birth <= 99) {
            Double new_birth = birth + 2000;
            Double new_year = year + 1999;
            Double age = (new_year - new_birth);
            System.out.println("Your age: " + age);
        } else if (birth >= 21 && birth <= 99 && year >= 21 && birth <= 99){
            Double new_birth = birth + 1900;
            Double new_year = year + 1900;
            Double age = (new_year - new_birth);
            System.out.println("Your age: " + age);
        } else{
            System.out.println("Error try again");
        }

       
    }
}