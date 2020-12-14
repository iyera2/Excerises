import java.io.*;
import java.util.*;

public class Excerise1 {
	
	public static void main(String[] args) {
	
		Scanner userInput = new Scanner( System.in );
		System.out.print( "File name: " );
		String fileName = userInput.nextLine();

		while(  !fileName.equals( "quit" ) ) {

			try {
				System.out.println( findAvg( fileName ) );
			}
			catch( Exception e ) {
				e.printStackTrace();
			}

			System.out.print( "File name: " );
			fileName = userInput.nextLine();

		}

	}

	public static double findAvg( String fileName ) throws Exception {

		Scanner scan = new Scanner( new File( fileName ) );
		double sum = 0;
		int counter = 0;
		while( scan.hasNextDouble() ) {
			sum += scan.nextDouble();
			counter++;
		}

		return sum / counter;

	}

}