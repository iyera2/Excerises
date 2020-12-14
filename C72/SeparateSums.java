import java.io.*;
import java.util.*;

public class SeparateSums{
    public static void main(String[] args) throws IOException {
        File file = new File("SeparateFile.txt");
        Scanner scan = new Scanner(file);
        int x = 0, y = 0;
        String sum;
        
        while(scan.hasNext()){
            sum = scan.next();
            int num = scan.nextInt();

            if(sum.equals("x=")){
                x += num;
            } else {
                y += num;
            }
        }
        System.out.println("x=" + x + ",y=" + y);
    }
}