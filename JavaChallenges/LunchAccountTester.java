public class LunchAccountTester{ // getting constructor error don't know why
    public static void main(String[] args) {

        LunchAccount firststudent = new LunchAccount(10000.0);
        System.out.println(student1.getBalance());
        firststudent.addBalance(10);
        System.out.println(student1.getBalance());
        testPurchase(student1.buyLunch());
        System.out.println(firststudent);


        LunchAccount secondstudent = new LunchAccount(100.0);
        System.out.println(student2.getBalance());
        firststudent.addBalance(100);
        System.out.println(secondstudent.getBalance());
        testPurchase(student1.buyLunch(-100));
        System.out.println(secondstudent);

        
        

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