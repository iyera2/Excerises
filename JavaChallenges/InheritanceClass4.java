public class InheritanceClass4 extends InheritanceClass3 {
    private double payRate;    
    private double hoursWorked;
    private String department;
   
    public final int HOURS = 40;
    public final double OVERTIME = 1.5;
   
     //default constructor
     public InheritanceClass4() {
       super();
       payRate = 0;
       hoursWorked = 0;
       department = "";
     }
 
     public InheritanceClass4(String firstname, String lastname, double payRate, double hoursWorked, String department ){
      super(firstname, lastname);
      this.department = department;
      this.payRate = payRate;
      this.hoursWorked = hoursWorked;
     }

     public InheritanceClass4(String firstname, String lastname, String department, double payRate){
       this(firstname, lastname, payRate, 0, department);
     }
    
    
     public String toString() {
       return "The wages for " + super.toString() + "from the " + department + "department are " + calculatePay();
     }
 
     public void print() {
       System.out.println("The employee " + super.toString() + " worked " + hoursWorked + " hours with a pay rate of " + payRate + ". The wages for this employee are " + calculatePay());
     }
 
    
     public double calculatePay() {
        if(hoursWorked <= HOURS){
          return (double) hoursWorked + payRate;
        }
        return (double) HOURS * payRate + ((double) (hoursWorked - HOURS) * payRate * OVERTIME);
     }
 
 
     public void setAll(String first, String last, double rate, double hours, String dep){
        super.setName(firstname, lastname);
        payRate = rate;
        hoursWorked = hours;
        department = dep;
     }
 
     public double getPayRate() {
         return payRate;
     }
 
    
     public double getHoursWorked() {
         return hoursWorked;
     }
    
    
     public String getDepartment() {
        return department;
     }
    
     public boolean equals(Object o) {
       if(o instanceof InheritanceClass4){
        InheritanceClass4 employee = (InheritanceClass4)o;
        return (employee.getPayRate() == this.getPayRate() ) && ( employee.getHoursWorked() == this.getHoursWorked() ) && this.getDepartment().equals( employee.getDepartment()) && super.equals(o);
       }
       return false;
     }
    
     public InheritanceClass4 getCopy() {
       return new InheritanceClass4(getFirstName(), getLastName(), payRate, hoursWorked, department);
     }
    
     public void copy(InheritanceClass4 e) {
       super.copy(e);
       department = e.getDepartment();
       hoursWorked = e.getHoursWorked();
       payRate = e.getPayRate();
     }
      
}