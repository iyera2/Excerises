import java.util.Scanner;

public class LetterLine{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int i =0;

        System.out.println("Enter the word: ");
        word = scan.next();

        while(i < word.length()){
            System.out.println( word.charAt( i ) );
            i++;
        }
    }
}