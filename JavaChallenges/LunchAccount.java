public class LunchAccount{

    private String student;
    private int id, startingbalance, currentbalance;
    private static int employeeCount = 0;

    public LunchAccount(String student){

        this.student = student;
        this.id = employeeCount;
        employeeCount++;
    }

    public void setStudent(String student){
        this.student = student;
    }

    public void getStudent(){
        return student;
    }

    public void setID(int id){
        this.id = id;
    }

    public int getID(){
        return id;
    }
    public void setStartingBalance(int startingbalance){
        this.startingbalance = startingbalance;
    }
    public void setCurrentBalance(int currentbalance){
        this.currentbalance = currentbalance;
    }

    public void totalMoney( int money){

        this.startingbalance += money;
        this.currentbalance += money;

    }

    
   
}