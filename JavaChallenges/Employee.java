public class Employee{

    private String name, position;
    private int wage, currentHours, total;

    public Employee(String name, String position, int wage, int hours, int total) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.currentHours = currentHours;
        this.total = total;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition(){
        return position;
    }

    public void setWage(int wage){
        this.wage = wage;
    }

    public int getWage(){
        return wage;
    }

    public void setHours(int currentHours){
        this.currentHours = currentHours;
    }

    public int getHours(){
        return currentHours;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public int getTotal(){
        return total;
    }

    public void employeeWork(int hours){
        this.currentHours += hours;
        this.total += hours;
    }


}