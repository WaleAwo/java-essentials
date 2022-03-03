package polymorphism;

public class MyClass {
    public static void main(String[] args) {
        // jave looks for the type of object at runtime and selects the appropiate overriden methods

        // type of objet is "fulltime"
        Employee e = new FullTime();
        System.out.println("Fulltime employee salary is: " + e.salary());

        // local methods will not be available unless you create an object of that class
        FullTime ft = new FullTime();
        ft.myMethod();

        // type of objet is "contractor"
        e = new Contractor();
        System.out.println("Contractor salary is: " + e.salary());

        // how to access a static method (use the class name)
        System.out.println(Employee.designation());
        System.out.println(FullTime.designation());
        System.out.println(Contractor.designation());

        // overloading example
        MyOverloadingClass moc = new MyOverloadingClass();
        moc.myMethod(2);
        moc.myMethod("overload", 6);
        moc.myMethod("overload");
    }
}
