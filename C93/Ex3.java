public class Ex3{
    public static void main(String[] args) {
        int[] Array = {0,1,2,3};
        System.out.println(sum(Array, 0));
    }

    public static int sum(int[] array){
        return sum(array,0);
    }

    public static int sum(int[] array, int index){
        if(index == array.length){
            return 0;
        }
        return array[index] + sum(array, index+1);
    }
}