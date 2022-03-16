package interviews;

import java.util.Scanner;

public class FindLetter {
    public static void main(String[] args) {
        // find the first letter in a text that matches 'A'

        System.out.println("Enter some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // loop through to the end of the length of the text
        for(int i=0; i<text.length(); i++){

            // get the current letter and check if it equals 'A'
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
