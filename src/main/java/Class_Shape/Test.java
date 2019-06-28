package Class_Shape;

public class Test {
    public static void main(String[] args) {
        Class_shape[] shapes = new Class_shape[2];
        shapes[0] = new Retangle();
        shapes[1] = new Circle();
        double rd = Math.random()*100;
        for (Class_shape shape:shapes
             ) {
            shape.resize(rd);
            System.out.println(shape);
        }
    }

}
