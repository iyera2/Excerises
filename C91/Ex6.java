public class Ex6{
    public static void main(String[] args) {
        
    }

    public static int Penta(int PN){
        if(PN == 1){
            return 1;
        } else {
            return (PN * (3 * (PN) -1))/2;
        }
    }
}