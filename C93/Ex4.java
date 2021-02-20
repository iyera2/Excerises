public class Ex4{
    public static void main(String[] args) {
        
    }

    public static int element(int[] array, int n){
        if(n == 1){
            return array[0];
        }
        return Math.max(array[n-1], element(array, n -1));
    }
}