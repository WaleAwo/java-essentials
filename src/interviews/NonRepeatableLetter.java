package interviews;

public class NonRepeatableLetter {
    public static void main(String args[]) {
        String inputStr = "sky glass";

        for (char i : inputStr.toCharArray()) { // converts the string to a character array
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: " + i);
                break;
            }
        }
    }
}
