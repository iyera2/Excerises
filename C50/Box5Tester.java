public class Box5Tester{
    public static void main(String[] args) {
        Box5 box1 = new Box5(2.5, 5.0, 6.0);
        Box5 box2 = new Box5(0.0, 0.0, 0.0);
        Box5 box3= new Box5(5.0, 4.0, 8.9);
        Box5 biggerBox = box1.biggerBox(box1);
        Box5 smallerBox = box1.smallerBox(box1);
        Box5 biggerBox2 = box2.biggerBox(box2);
        Box5 smallerBox2 = box2.smallerBox(box2);
        Box5 biggerBox3 = box3.biggerBox(box3);
        Box5 smallerBox3 = box3.smallerBox(box3);
        System.out.println("Area: " + box1.area() + " volume: " + box1.volume());
        System.out.println( "Area: "  + biggerBox.area() + " volume: " + biggerBox.volume());
        System.out.println( "Area: "  + smallerBox.area() + " volume: " + smallerBox.volume());
        System.out.println("Area: " + box2.area() + " volume: " + box2.volume());
        System.out.println( "Area: "  + biggerBox2.area() + " volume: " + biggerBox2.volume());
        System.out.println( "Area: "  + smallerBox2.area() + " volume: " + smallerBox2.volume());
        System.out.println("Area: " + box3.area() + " volume: " + box3.volume());
        System.out.println( "Area: "  + biggerBox3.area() + " volume: " + biggerBox3.volume());
        System.out.println( "Area: "  + smallerBox3.area() + " volume: " + smallerBox3.volume());
        System.out.println(biggerBox.nests(smallerBox));
        System.out.println(smallerBox.nests(biggerBox)); //Didn't test all of them.  Sorry
       
    }
}