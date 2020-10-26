import java.util.Scanner;

public class WordDot{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1, word2;

        System.out.println("Enter first word: ");
        word1 = scan.next();
        System.out.println("Enter second word: ");
        word2 = scan.next();

        while(word1.length()+word2.length()<= 30){
            word1 += ".";
        }
        System.out.println(word1+word2);
    }
}