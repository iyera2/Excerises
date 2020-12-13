import java.io.*;
import java.util.*;

public class SumFileInt{
    public static void main(String[] args) throws IOException {
        File file = new File("SumFile.text");
        Scanner scan = new Scanner(file);
        int num = 0;

        while(scan.hasNextInt()){
            num += scan.nextInt();
           
        }
        System.out.println("The sum is " + num);
    }
}