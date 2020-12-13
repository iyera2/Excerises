import java.util.*;
import java.io.*;

public class AvgSDeviation{
    public static void main(String[] args) throws IOException 
    {
        File file = new File("InputASD.txt");
        Scanner scan = new Scanner(file);
        double num = 0, sum = 0, sumSQ = 0, avg, avgSQ = 0, var, sd;
        int i = 0;

        while(scan.hasNextDouble()){
            num = scan.nextDouble();
            sum += num;
            sumSQ += num*num;
            i++;
        }
        avg = sum/i;
        avgSQ = avgSQ/i;
        var = avgSQ - (avg*avg);
        sd = Math.pow(var,0.5);
        System.out.println("Average: " + avg + ",SD: " + sd);
    }
}