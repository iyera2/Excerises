public class InheritanceClass4 extends InheritanceClass3 {
    private double payRate;    
    private double hoursWorked;
    private String department;
   
    public final int HOURS = 40;
    public final double OVERTIME = 1.5;
   
     //default constructor
     public InheritanceClass4() {
...
     }
 
     //add an alternate constructor with parameters
    
    
     public String toString() {
         //should return a String like this:
         //The wages for xxxx from the xxxx department are: $xxxxx.xx"
 
   ...
     }
 
     public void print() {
       //Should print output like this (same line):
       //The employee xxxx from the xxxx department worked xx hours
       //with a pay rate of $xxx.xx. The wages for this employee are $xxxxx.xx
       ...
     }
 
    
     public double calculatePay() {
        //Method to calculate and return the wages
        //handle both regular and overtime pay
 
        ...
     }
 
 
     public void setAll(String first, String last, double rate, double hours, String dep){
         ...
     }
 
     public double getPayRate() {
         ...
     }
 
    
     public double getHoursWorked() {
         ...
     }
    
    
     public String getDepartment() {
         ...
     }
    
     public boolean equals(Object o) {
       ...
     }
    
     public Employee getCopy() {
       ...
     }
    
     public void copy(Employee e) {
       ...
     }
      
}