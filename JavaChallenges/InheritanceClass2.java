public class InheritanceClass2 extends InheritanceClass1 {
    private int z;

    // x = 0, y = 0, z = 0
    public InheritanceClass2() { 
       x = 0;
       y = 0;
       z = 0;
    }

    // x = x1, y = y1, z = z1
    public InheritanceClass2(int x1, int y1, int z1) { 
       x = x1;
       y = y1;
       z = z1;
    }
    //output x, y, z 
    public void print() { 
       System.out.print(x + " " + y + " " + z + " ");
    }
    public String toString() { 
       return x + " " + y + " " + z + " ";
    }
    //x = x1, y = y1, z = z1 
    public void set(int x1, int y1, int z1) { 
       x = x1;
       y = y1;
       z = z1;
    } 
 }