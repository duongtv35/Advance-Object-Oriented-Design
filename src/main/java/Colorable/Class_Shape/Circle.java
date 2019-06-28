package Colorable.Class_Shape;

public class Circle extends Class_shape   {
    private double radius =1;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + "which is a subclas of Class_shape" +'}'
                +super.toString();
    }




    }
}
