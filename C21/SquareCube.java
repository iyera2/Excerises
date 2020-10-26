import java.util.Scanner;

public class SquareCube{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperlimit, squares = 0, cubes = 0, i = 0;

        System.out.println("Upper Limit: ");
        upperlimit = scan.nextInt();

        while(i <= upperlimit){
            squares += Math.pow(i, 2);
            cubes += Math.pow(i, 3);
            i++;
        }
        System.out.println("The sum of Squares is " + squares);
        System.out.println("The sum of Cubes is " + cubes);
    }
}