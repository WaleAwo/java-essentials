package exceptions.java;

import java.io.File;
import java.io.FileNotFoundException;

public class MyClass {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("c://myfile.txt");
        try {
            System.out.println("Random");;
            throw new MyException();
        } catch (MyException e) {
            e.printException();
        }
        System.out.println("Message");

        /*File file = new File("c://myfile.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        /*int myArray[] = {1, 2, 3};
        System.out.println(myArray[3]); // runtime exception*/

    }
}
