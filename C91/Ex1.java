import java.util.Scanner;

class TriangleCalc
{
  public int Triangle( int N )
  {
    if ( N == 1 )
      return 1;
    else
      return N + Triangle( N-1 );
  }
}

public class Ex1
{
  public static void main ( String[] args)
  {
    Scanner scan = new Scanner("System.in");
    TriangleCalc tri = new TriangleCalc();
    int n = scan.nextInt();
    if(n < 0){
        System.out.println("Must be positive");
        n = scan.nextInt();
    }
    int result = tri.Triangle( 4 );
    System.out.println("Triangle(4) is " + result );
  }
}