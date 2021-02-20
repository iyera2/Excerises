public class Ex5{
    public static void main(String[] args) {
        System.out.println(residue(45, 14));
    }

    public static int residue(int a, int m){
        if(a > 0 && a <= (m-1)){
            return a;
        }
        if(a < 0){
            a+=m;
        }
        if(a >= m){
            a-=m;
        }
        return residue(a,m);
    }
}