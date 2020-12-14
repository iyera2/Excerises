import java.util.*;
import java.io.*;

public class NumberFilter{
    public static void main(String[] args) throws IOException {
        File file = new File("Number.txt");
        Scanner scan = new Scanner(file);

        PrintWriter file1 = new PrintWriter("file1.md");
        PrintWriter file2 = new PrintWriter("file2.md");

        int num = 0;

        while(scan.hasNextInt()){
            num = scan.nextInt();
            if(num < 0){
                file1.println(num);
            } else {
                file2.println(num);
            }
        }
    }
}