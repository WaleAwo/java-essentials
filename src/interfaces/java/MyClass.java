package interfaces.java;

public class MyClass {
    public static void main(String[] args) {
        Circle circle = new Circle("Lime", 8.1);

        System.out.println(circle.info());

        Shape.staticMethod();
        System.out.println(Shape.i);
    }
}