package polymorphism;

public class Contractor extends Employee {

    @Override
    int salary(){
        return base + 30000;
    }

    static String designation(){
        return "contractor";
    }
}
