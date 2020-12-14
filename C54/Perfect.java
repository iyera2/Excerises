import java.util.Scanner;

public class Perfect{
    public static boolean main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper limit: ");
        int upper = scan.nextInt(); 
        for(i = 0; i < upper; i ++){
            System.out.println(isPerfect(i));
        }   

        public static boolean isPerfect(int num)
        {
            int sum = 0;
            for(i = 1; i < num; i++){
                if(num % i == 0){
                    sum = sum + i;
                }           
            }
            if(sum != num){
                return false;
            }  
            return true;  
        }
    }
}