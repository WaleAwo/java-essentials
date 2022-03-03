package modifiers.access.qa;

public class QaClass {
    protected String str = "My String";

     public void myMethod(){
        System.out.println("public qa method");
    }

    private void myMethod1(){
         myMethod();
        System.out.println(str);
    }
}
