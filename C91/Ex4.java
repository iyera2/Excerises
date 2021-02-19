public class Ex4{
    public static void main(String[] args) {
        System.out.println(Log(1));
    }

    public static int Log(int N){
        if(N == 1){
            return 0;
        } else {
            return (1 + Log(N/2));
        }
    }
}