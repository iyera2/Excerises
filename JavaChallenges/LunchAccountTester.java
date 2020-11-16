public class LunchAccountTester{ // getting constructor error don't know why
    public static void main(String[] args) {

        LunchAccount firststudent = new LunchAccount();
        LunchAccount secondstudent = new LunchAccount(100.0);

        System.out.println(firststudent);
        System.out.println(secondstudent);

        firststudent.addBalance(10);
        secondstudent.addBalance(0);

        System.out.println(firststudent);
        System.out.println(secondstudent);

        for(int i = 0; i < 98; i++){
            LunchAccount student = new LunchAccount(10.50);
            System.out.println(student);
        }
        LunchAccount student = new LunchAccount(10);
        System.out.println(student);
        
    }

    public static void testPurchase(boolean isCheck){
        if(isCheck){
            System.out.println("Purchase went through");
        } else{
            System.out.println("Your purchase didn't go through. :(");
        }
    }
}