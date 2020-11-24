public class Box2Tester{
    public static void main(String[] args) {
        Box box1 = new Box(2.5, 5.0, 6.0);
        Box box2 = new Box(0.0, 0.0, 0.0);
        Box box3= new Box(5.0, 4.0, 8.9);
        System.out.println("Area: " + box1.area() + " volume: " + box1.volume());
        System.out.println("Area: " + box2.area() + " volume: " + box2.volume());
        System.out.println("Area: " + box3.area() + " volume: " + box3.volume());
       
    }
}