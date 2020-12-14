import java.util.*;
import java.io.*;

public class Extractor{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        File file1 = new File("email.txt");
        File file2 = new File("email2.txt");
        PrintWriter newFile = new PrintWriter(file1);
        Scanner newFile2 = new Scanner(file2);

        while(newFile2.hasNext()){
            String could = newFile2.next();
            if(could.indexOf("@") != 1 && could.indexOf(".") != 1) {
                newFile.println(could);
            }
            scan.close();
            newFile.close();
            newFile2.close();
        }
    }
}