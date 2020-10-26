import java.util.Scanner;

public class EchoWord{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int i = 0;

        System.out.println("Enter a word: ");
        word = scan.next();

        while(i < word.length()){

            System.out.println(word);
            i++;
        }
    }
}