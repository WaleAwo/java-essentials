package encapsulation;

public class WriteOnlyClass {
    private String str = "My String";

    public void setStr(String str) {
        this.str = str;
    }

    public void printString() {
        System.out.println(str);
    }

}
