public class Ex3{
    public static void main(String[] args) {
        System.out.println(Square(1));
    }
    public static int Square(int N){
        if(N == 1){
            return 1;
        } else {
            return Square(N-1) + 2*N-1;
        }
    }
}


