package interviews;

public class CountAllCharacters {
    public static void main(String[] args) {
        String exampleString = "Sample string";

        int stringLength = exampleString.length();
        System.out.println("String length: " + stringLength);

        int stringLengthWithoutSpaces = exampleString.replace(" ", "").length();
        System.out.println("String length without counting whitespaces: " + stringLengthWithoutSpaces);
    }
}
