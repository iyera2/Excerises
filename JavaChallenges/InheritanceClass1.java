public class InheritanceClass1 {
    public int x;
    public int y;

    public InheritanceClass1() {
        x = 0;
        y = 0;
    }

    public InheritanceClass1(int x1, int y1) {
       x = x1; 
       y = y1; 
    }
    public void print() { 
       System.out.print(x + " " + y + " "); 
    }
    public String toString() { 
       return x + " " + y + " "; 
    }
    public void set(int x1, int y1) { 
       x = x1; 
       y = y1; 
    } 
 }