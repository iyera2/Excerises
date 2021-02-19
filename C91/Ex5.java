public class Ex5{
    public static void main(String[] args) {
        System.out.println(Pow(1));
    }

    public static int Pow(int N){
        if(N == 0){
            return 1;
        } else {
            return (2 * Pow(N-1));
        }
    }
}