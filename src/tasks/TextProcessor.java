package tasks;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("Today is a good day");
    }

    /**
     * Splits a string into an array
     * Counts the number of words and prints them
     * @param text String to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);
        System.out.println();

        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
}