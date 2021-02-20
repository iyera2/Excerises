public class Ex1 {
    public static void main(String[] args) {
        System.out.println(prime(7));
    }

    public static boolean prime(int n){
        return prime(n, n/2);
    } 

    public static boolean prime(int n, int x){
        if(n == 1){
            return true;
        } 
        if(n % x == 0){
            return false;
        }
        return prime(n, x-1);
    }
}