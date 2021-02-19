public class Ex2
{
  public static void main ( String[] args)
  {
    System.out.println(Triangle(4));
  }

  public static int Triangle(int N){
    if(N == 1 || N == 0){
        return 1;
    } else {
        return N + Triangle(N-1);
    }
  }
}