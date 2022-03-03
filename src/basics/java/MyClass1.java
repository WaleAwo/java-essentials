package basics.java;

public class MyClass1 {
    public static void main(String[] args) {
      MyClass1 myClass1 = new MyClass1();
      myClass1.myMethod1();
      myClass1.myMethod2();
    }

    // calling a static method from another class
    public void myMethod1(){
        MyClass.anotherClass(); // you don't have to create an object of that class
        System.out.println(MyClass.e);
    }

    // calling a non-static method from another class
    public void myMethod2(){
        MyClass myClass = new MyClass(); // create an object of the called class first
        myClass.initialize();
        System.out.println();
        System.out.println("This is non-static method from another class");
        System.out.println(myClass.j);
    }
}
