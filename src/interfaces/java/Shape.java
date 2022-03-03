package interfaces.java;

// use the "interface" keyword
interface Shape {
    // variables - public, static & final
    int i = 1;

    // methods declerations
    String color();
    double area();
    String info();

    // regular method
    default void defaultMethod(){
        System.out.println("Default method");
    }

    // static method - doesn't have to be implemented
    static void staticMethod(){
        System.out.println("static method");
    }
}
