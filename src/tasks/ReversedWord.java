package tasks;

public class ReversedWord {

    public static void main(String[] args) {
        reverseString("camel");
    }

    /**
     * Prints a String in reverse order
     * Loops through a word in reverse order
     * @param word String to reverse
     */
    public static void reverseString(String word){
        for (int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
