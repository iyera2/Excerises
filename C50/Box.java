public class Box{
    private double width, height, length;

    public Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side){
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

    public double area(){
        return 2 * (length * width + length * height + height * width);
    }
}