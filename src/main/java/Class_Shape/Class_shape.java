package Class_Shape;

public class Class_shape implements Resizeable{
    private String color = "green";
    private boolean filled = true;

    public Class_shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Class_shape() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Class_shape{" +
                "color='" + this.color + '\'' +
                ", filled=" + this.filled +
                '}';
    }

    @Override
    public void resize(double percent) {

    }
}
