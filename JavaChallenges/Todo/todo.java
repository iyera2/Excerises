public class todo {
    private String description;
    private String date;
    private boolean isDone;
    private int priority;

    public todo(String description, String date, boolean isDone, int priority){
        this.description = description;
        this.date = date;
        this.priority = priority;
        isDone = false;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }

    public void setPriority(){
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }

    public String toString(){
        return "isDone is " + isDone + ". Description: " + getDescription() + ", Date: " + getDate() + ", Priority: " + getPriority();
    }
}