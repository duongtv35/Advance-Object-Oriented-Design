package Colorable.Class_Shape;

public class Retangle extends Class_shape implements Colorable {
    private double width =1;
    private double height =1;

    public Retangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Retangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    @Override
    public String toString() {
        return "Retangle with width =" +  this.width +"and height= " +
                this.height +"which a subclass of" + "Class_shape{" +
                "color='" + super.toString();

    }

    @Override
    public void howToColor() {

    }
}


