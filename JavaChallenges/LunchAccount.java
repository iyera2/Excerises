public class LunchAccount{

    private int id,meals, total;
    private double startingbalance;
    private static int studentCount = 0, number = 999;
    private boolean isAdded = false;

  public LunchAccount(double startingbalance){ //getting constructor error don't know why

      startingbalance = 0;
      this.id = 1000 + idCount;
      idCount++;
      meals = 0;
      total = 0;
      this.startingbalance = 0;
      addBalance(startingbalance);

  }

  public double getBalance(){
      return balance;
  }

  public int getId(){
    return id;
  }

  public void addBalance(double balance){
      if(startingbalance > 0){
          if(!isAdded){
            studentCount++;
            this.isAdded = true;
            if(studentCount <= 100){
                this.startingbalance += 20;
            }
            this.startingbalance += startingbalance;
          }
      }
  }

  public void lunch(double cost){
      if(startingbalance > cost && cost > 0){
          startingbalance -= cost;
          meals++;
          total += cost;
      }
  }

  private boolean buyLunch(double cost){
      return startingbalance >= cost;
  }

  public String toString(){
      return "Student " + id + " has " + startingbalance + " Total spent:" + total + "They have purchased " + meals;
  }

  
    
   
}