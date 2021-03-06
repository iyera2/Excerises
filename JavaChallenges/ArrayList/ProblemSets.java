import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProblemSets{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("grape", "apple", "banana", "strawberry", "orange", "watermelon", "lemon", "avocado", "peach", "blueberry"));
        ArrayList<String> vegs = new ArrayList<>(Arrays.asList("spinach", "carrot", "broccoli", "garlic", "brussel sprout", "kale", "green peas", "ginger", "asparagus", "cabbage"));
        ArrayList<Integer> integer = new ArrayList<>(Arrays.asList(12,13,13,16,16));
    }


    //Ex 0
    public static ArrayList<String> combineList(ArrayList<String> fruits, ArrayList<String> vegs){
        ArrayList<String> combinedList = new ArrayList<String>(fruits);

        combinedList.addAll(vegs);
        Collections.sort(combinedList);

        return combinedList;
    }

    //Ex 1
    public static ArrayList<String> returnList(ArrayList<String> list, ArrayList<String> list1){
        ArrayList<String> returnList = new ArrayList<String>(list);

        returnList.retainAll(list1);

        return returnList;
    }

    //Ex 2
    public static ArrayList<String> removeDuplicate(ArrayList<String> list){
        int size = list.size();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        return list;
    }

    //Ex 3
    public static ArrayList<Integer> addNum(ArrayList<Integer> integer, int number){
        ArrayList<Integer> nums = new ArrayList<Integer>();


        for(int i = 0; i < integer.size(); i++){
            if(integer.get(i) < number && integer.get(i+1) > number){
                nums.add(integer.get(i), number);
            } else {
                nums.add(integer.get(i));
            }
        }
        return nums;
    }

    //Ex 4
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> integer){
        for(int i = 0; i < integer.size()/2; i++){
            int temp = integer.get(i).intValue();
            integer.set(i, integer.get(integer.size() - (i+1)));
            integer.set(integer.get(integer.size() - (i+1)),temp);
        }
        return integer;
    }

    //Ex 5
    
}

