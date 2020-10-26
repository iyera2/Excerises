import java.util.Scanner;

public class RunInt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start, end;

        System.out.println("Enter start: ");
        start = scan.nextInt();
        System.out.println("Enter end: ");
        end = scan.nextInt();

        while(start<=end){
            System.out.println(start);
            start+=1;
        }
    }
}