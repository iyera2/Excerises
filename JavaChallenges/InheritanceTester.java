public class InheritanceTester{
    public static void main(String[] args) {
        InheritanceClass2 one =  new InheritanceClass2(5,6,7);
        InheritanceClass1 two = new InheritanceClass1(6,7);

        one.print();
        two.print();
    }
}