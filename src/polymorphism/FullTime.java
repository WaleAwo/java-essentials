package polymorphism;

public class FullTime extends Employee {

    @Override
    int salary() {
        return base + 20000;
    }

    public void myMethod() {
        System.out.println("Fulltime method");
    }

    static String designation(){
        return "fulltime";
    }
}
