public class Box2{
    private double width, height, length;

    public Box2(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box2(double side){
        width = side;
        height = side;
        length = side;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }   

    public double getHeight(){
        return height;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double setLength(){
        return length;
    }

    public double volume(){
        return width * length * height;
    }

    private double faceArea(){
        return length * width;
    }

    private double sideArea(){
        return height * width;
    }

    public double topArea(){
        return length * width;
    }

    public double area(){
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }
}