package encapsulation;

public class MyPrivateClass {
    private String str = "My string";

    // getter
    public String getStr() {
        return str;
    }

    // setter
    public void setStr(String str) {
        this.str = str;
    }

    private void myMethod() {
        System.out.println("My method");
    }

}
