package inheritance;

public class MyClass {
    public static void main(String[] args) {

        // prints the super and sub class constructors
        MySubClass mySubClass = new MySubClass();
        System.out.println();

        // prints the super class method due to inheritance
        mySubClass.superClassMethod();
        System.out.println();

        // prints the sub class method
        mySubClass.subClassMethod();
        System.out.println();

        // prints the super class variable due to inheritance
        System.out.println(mySubClass.superStr);
        System.out.println();

        // prints the super and sub variables
        mySubClass.printCommonString();
        System.out.println();

        // prints the super and sub methods
        mySubClass.printCommonMethod();
        System.out.println();
    }
}
