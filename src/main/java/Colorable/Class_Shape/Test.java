package Colorable.Class_Shape;

public class Test {
    public static void main(String[] args) {
        Class_shape[] shapes = new Class_shape[2];
        shapes[0]= new Retangle("red",true,4,6);
        shapes[1] = new Circle("yellow",false,4);
        for (Class_shape shape: shapes
             ) {
            System.out.println(shape);
            if(shape instanceof Circle){



            }

        }



    }
}
