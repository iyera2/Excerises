public class Paycheck{
    private Employee current;
    private int currentHours;
    private double paied;
    private int wage;
    private boolean isFalse;

    public Paycheck(Employee current) {
        this.current = current;
        this.currentHours = current.getHours();
        this.wage = current.getWage();
        this.paied = 0.85 * (wage * currentHours);

        if(currentHours > 100 && paied > 1500){
            isFalse = false;
        } else {
            isFalse = true;
        }
    }
}