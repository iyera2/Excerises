public class CylinderTester{
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(1.0, 12.0);
        Cylinder c2 = new Cylinder(0.0, 2.0);
        Cylinder c3 = new Cylinder(3.0, 4.0);
        System.out.println(c1.area());
        System.out.println(c1.volume());
        System.out.println(c2.area());
        System.out.println(c2.volume());
        System.out.println(c3.area());
        System.out.println(c1.volume());
    }
}