import java.util.Scanner;

public class FactorialErrorFlag{ 
    public static void main(String[] args) {
        int num = 50;
        if(flag(num) == -1){
            System.out.println("WRONG!! Just wrong");
        } else {
            System.out.println(flag(num));
        }
    }

    
    public static int flag(int f){
        int sum = 1, new_num;
        if(f > 20 || f < 0){
            return -1;
        }
        for(new_num = 1; new_num > 1; new_num--){
            sum = sum * new_num;
        }
        return sum;
    }
}