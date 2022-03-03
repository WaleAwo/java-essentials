package abstraction;

public class MyClass {
    public static void main(String[] args) {

        Circle circle = new Circle("Green", 5.0);
        Square square = new Square("Grey", 12);

        System.out.println(circle.info());
        System.out.println(square.info());
    }
}
