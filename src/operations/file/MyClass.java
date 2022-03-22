package operations.file;

import java.io.*; // Import the File class

public class MyClass {
    public static void main(String[] args) {

        String dirPath = "folder" + File.separator + "anotherFolder";

        File dir = new File(dirPath);
        if (!dir.exists()){ // checks the directory doesn't exist
            dir.mkdirs(); // creates directory
        } else {
            System.out.println("The directory already exists.");
        }

        File file = new File(dirPath +
                File.separator + "MyFile.txt"); // create a file object

        if(!file.exists()){ // checks the file doesn't exist
            try {
                file.createNewFile(); // creates file
            } catch (IOException e) {
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
    }
}
