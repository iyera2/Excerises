public class Ex4{
    public static void main(String[] args) {
        System.out.println(GCD(6,9));
    }

    public static int GCD(int a, int b){
        if(a == 0){
            return b;
        }

        return GCD(b%a, a);
    }
}