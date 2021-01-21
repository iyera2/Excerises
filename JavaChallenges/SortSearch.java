import java.util.Random;

public class SortSearch{

    public static Random random = new Random();
    public static final int NUM_TESTS = 10000;
    public static final int TEST_DATA_SIZE = 100;
    public static final int RANDOM_RANGE = 100;
    public static void main(String[] args) {
        int[] list = {20, 30, 40, 60, 10};
        System.out.println(search(list));
        System.out.println(sort(list));
        for (int i = 0; i <list.length; i++) {     
            System.out.print(list[i] + " ");    
        } 

        testSort("selection", NUM_TESTS);
        testSort("insertion", NUM_TESTS);
        testSort("bubble", NUM_TESTS);
    }

    public static void testSort(String method, int times){
        for(int test = 0; test < times; test++){
            int[] data = createTestData(TEST_DATA_SIZE);
            int[] orig = duplicate(data);

            sortUsing(data, method);

            if(!isSortedAsc(data)){
                printSortErrorMessage(method, data, orig);
                return;
            }
        }
        System.out.println("All tests sorted correctly for " + method + "\n");
    }

    public static void sortUsing(int[] data, String method){
        if(method.toLowerCase().equals("selection")){
            selectionSort(data);
        } else if(method.toLowerCase().equals("insertion")){
            insertionSort(data);
        } else {
            bubbleSort(data);
        }
    }

    public static void printSortErrorMessage(String method, int[] data, int[] orig){
        System.out.println("Error, during " + method);
        System.out.println("Original data:");
        print(orig);
        System.out.println("After sorting: ");
        print(data);
        System.out.println();
    }

    public static int[] createTestData(int amount){
        int[] data = new int[amount];
        for(int i = 0; i < data.length; i++){
            data[i] = random.nextInt(RANDOM_RANGE);
        }
        return data;
    }

    public static int[] duplicate(int[] data){
        int[] dup = new int[data.length];
        for(int i = 0; i < data.length; i++){
            dup[i] = data[i];
        }
        return dup;
    }

    public static void print(int[] data){
        System.out.println("[");
        for(int i = 0; i < data.length; i ++){
            System.out.println(data[i]);
            if(i < data.length -1){
                System.out.print(",");
            }
        }
        System.out.println("]\n");
    }

    public static boolean isSortedAsc(int[] data){
        for(int i = 0; i < data.length - 1; i ++){
            if(data[i+1] < data[i]){
                return false;
            }
        }

        return true;
    }

    public static int search(int[] data) {
        for(int i = 0; i < 4; i++){
            if(data[i] == 4){
                return i;
            }
        }
        return -1;
    }

    public static int bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i ++){
           for(int n = i + 1; n < data.length; n++){
                if(data[i] > data[n]) {
                    int var = data[i];
                    data[i] = data[n];
                    data[n] = var;
                }
           }
        }
        return 0;
    }

      
}    
