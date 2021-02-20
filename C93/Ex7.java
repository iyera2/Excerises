import java.util.Scanner;

public class Ex7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of Rows: ");
        int row = scan.nextInt();
        System.out.println("Number of Col: ");
        int col = scan.nextInt();
        System.out.println(tri(row, col));
    }

    public static int tri(int row, int col){
        if(col == 0 || row == 0){
            return 1;
        }
        return tri(row-1, col-1) + tri(row-1,col);
    }
}