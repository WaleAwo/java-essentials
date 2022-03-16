package interviews;

public class CountAllCharacters {
    public static void main(String[] args) {

        String exampleString = "Sample string";

        // use the length() function to get the length of a string
        // get string length with spaces
        int stringLength = exampleString.length();
        System.out.println("String length: " + stringLength);

        // get the string length without spaces
        int stringLengthWithoutSpaces = exampleString.replace(" ", "").length();

        // print string length without spaces
        System.out.println("String length without counting whitespaces: " + stringLengthWithoutSpaces);
    }
}
