package encapsulation;

public class MyClass {
    public static void main(String[] args) {
        MyPrivateClass mpClass = new MyPrivateClass();
        WriteOnlyClass woClass = new WriteOnlyClass();

        // get string value
        System.out.println(mpClass.getStr());

        // set string value
        mpClass.setStr("updated string");

        // get new string value
        System.out.println(mpClass.getStr());

        // write only setter
        woClass.setStr("write only");
        woClass.printString();
    }
}
