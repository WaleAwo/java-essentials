package abstraction;

// use the abstract keyword
abstract class Shape {
    String color;

    // constructor
    public Shape(String color){
    this.color = color;
    }

    // abstract method - which has to be implemented when called
    abstract double area();
    abstract String info();

    // regular method
    public String getColor(){
        return color;
    }
}
