public class Box4Tester{
    public static void main(String[] args) {
        Box4 box1 = new Box4(2.5, 5.0, 6.0);
        Box4 box2 = new Box4(0.0, 0.0, 0.0);
        Box4 box3= new Box4(5.0, 4.0, 8.9);
        Box4 biggerBox = box1.biggerBox(box1);
        Box4 smallerBox = box1.smallerBox(box1);
        Box4 biggerBox2 = box2.biggerBox(box2);
        Box4 smallerBox2 = box2.smallerBox(box2);
        Box4 biggerBox3 = box3.biggerBox(box3);
        Box4 smallerBox3 = box3.smallerBox(box3);
        System.out.println("Area: " + box1.area() + " volume: " + box1.volume());
        System.out.println( "Area: "  + biggerBox.area() + " volume: " + biggerBox.volume());
        System.out.println( "Area: "  + smallerBox.area() + " volume: " + smallerBox.volume());
        System.out.println("Area: " + box2.area() + " volume: " + box2.volume());
        System.out.println( "Area: "  + biggerBox2.area() + " volume: " + biggerBox2.volume());
        System.out.println( "Area: "  + smallerBox2.area() + " volume: " + smallerBox2.volume());
        System.out.println("Area: " + box3.area() + " volume: " + box3.volume());
        System.out.println( "Area: "  + biggerBox3.area() + " volume: " + biggerBox3.volume());
        System.out.println( "Area: "  + smallerBox3.area() + " volume: " + smallerBox3.volume());
       
    }
}