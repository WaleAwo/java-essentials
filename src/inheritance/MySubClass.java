package inheritance;

// use extends keyword to inherit
public class MySubClass extends MySuperClass {
    String commonStr = "sub common string";

    // constructor
    public MySubClass() {

        /*
        Use the 'super' keyword to call the MySuperClass constructor
        The
         */
        super("constructor string");
        System.out.println("sub class constructor");
    }

    public void subClassMethod(){
        System.out.println("sub class method");
    }

    public void printCommonString(){
        System.out.println(commonStr);
        System.out.println(super.commonStr); // prints the super class variable
    }

    // method override
    public void commonMethod(){
        System.out.println("sub common override method");
    }

    public void printCommonMethod(){
        commonMethod();
        super.commonMethod(); // prints the super method
    }
}
