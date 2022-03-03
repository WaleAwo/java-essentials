package operations.file;

import java.io.*;

public class MyClass {
    public static void main(String[] args) {

        String dirPath = "folder" + File.separator + "anotherFolder"; // folder path e.g. "folder/anotherFolder"

        File dir = new File(dirPath);
        if (!dir.exists()){ // check whether the diretory exists
            dir.mkdirs(); // creates a directory
        } else {
            System.out.println("The directory already exists.");
        }

        File file = new File(dirPath +
                File.separator + "MyFile.txt"); // create a file object in directory path (dirPath)

        if(!file.exists()){ // check whether the file exists
            try {
                file.createNewFile(); // creates an empty file
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        // Get different file properties
        System.out.println(file.getName()); // returns the name of the file
        System.out.println(file.getAbsoluteFile()); // returns the absolute pathname of the file
        System.out.println("Can I write to this file: " + file.canWrite()); // Tests whether the file is writable or not
        System.out.println("Can I read this file: " + file.canRead()); // Tests whether the file is readable or not
        System.out.println("The file size is: " + file.length()); // returns the size of the file in bytes

        // Write to a file
        try {
            FileOutputStream os = new FileOutputStream(file);
            String str = "My String";
            os.write(str.getBytes());
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from a file
        try {
            FileInputStream is = new FileInputStream(file);
            int i;
            while ((i = is.read()) != -1){
                System.out.print((char) i);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // delete file
        file.delete();

      /*
      FileWriter & FileReader

      // Write to file
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("First line");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file
        try {
            FileReader fr = new FileReader(file);
            int i;
            while ((i = fr.read()) != -1){ // loop to read each character
                System.out.print((char) i); // convert int to character then prints it to console
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        */
    }
}
