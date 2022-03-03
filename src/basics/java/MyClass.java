package basics.java;

   /*
    A Java class consists of:
        - Fields (variables) - containers for storing data values.
        - Methods
        - Data types
            - Primitive: int, float, boolean, char
            - Reference: String
     */

public class MyClass {

    /*
    A constructor in Java is a special method that is used to "initialize" objects.
    The constructor is called when an object of a class is created.
    It can be used to set initial values for object attributes.

    The constructor name must match the class name, and it cannot have a return type (like void).
     */

    public MyClass(){
        d = 3;
    } // Creating a MyClass constructor

    /*
    Creating a MyClass constructor which takes parameters
    The "this" keyword is used to assign the constructor variable to the global variable
     */
    public MyClass(int s){
        this.s = s;
    }

    // variables
    int i = 5;
    int j;
    int d;
    int s;
    int r;
    int m;
    static int q;
    static int e;
    String str = "Hello World";

    // methods
    public void initialize(){
        j = 2;
    }

    public int returnMethod(){
        r = 6;
        return r;
    }

    public static void initalize2(){
        q = 12;
    }

    public static void anotherClass(){
        System.out.println("This is a static method from another class");
        e = 34;
    }

    public MyClass returnClass(){
        m = 4;
        return this;
    }

    public void stringMethods(){
        str = str.concat("!");
        str = str.toUpperCase();
        str = str.substring(5);
        str = str.substring(5, 10);
        boolean flag = str.equalsIgnoreCase("Test");

        String strng = "5";
        int i = Integer.parseInt(strng); // convert to an integer

        int n = 9;
        String strng2 = String.valueOf(n); // convert to a string

    }

    public static void main(String[] args) {

        // creating an object of MyClass
        MyClass nonStatic = new MyClass(); // This will call the MyClass constructor
        System.out.println("d: " + nonStatic.d);

        // constructor with a parameter
        MyClass nonStaticVariable2 = new MyClass(10); // This will call the MyClass constructor with parameter
        System.out.println("s: " + nonStaticVariable2.s);

        // calling a non-static variable
        System.out.println("i: " + nonStatic.i); // you have to use the object name

        // calling a static method
        MyClass.initalize2(); // you have to use the class name
        System.out.println("q: " + q);

        // calling a non-static method
        nonStatic.initialize(); // you have to use the object name
        System.out.println("j: " + nonStatic.j);

        // calling a non-static return method
        System.out.println("r: " + nonStatic.returnMethod()); // you have to use the object name

        // return the instance of a class method
        System.out.println("m: " + nonStatic.returnClass().m); // you have to use the object name

        // calling a constant variable from another class
        System.out.println("Constant value: " + MyConstants.LONG_WAIT);

        // calling an enum fron another class
        System.out.println("Enum value: " + EnumConstants.SHORT_WAIT);

        // print string
        System.out.println("String value: " + nonStatic.str);
    }
}
