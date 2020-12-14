import java.io.*;
import java.util.*;

public class Excerise2{
    public static void main(String[] args) {
        Scanner scan;
        Scanner input = new Scanner(System.in);
        System.out.print("File name? ");
        String fileName = input.nextLine();
        int counter = 0;

        try {
			scan = new Scanner( new File( fileName ) );
			String line = scan.nextLine();
			int sum = 0;
			while( scan.hasNextLine() ) {
				if( !scan.hasNext( "next" ) ) {
					sum += scan.nextInt();
				} else {
					counter++;
					System.out.println( "Sum of group " + counter + " is " + sum );
					sum = 0;
					scan.next();
				}
			}
			System.out.println( "Sum of group " + (counter + 1) + " is " + sum );
		} catch( Exception e ) {
			e.printStackTrace();
		}
    }
}