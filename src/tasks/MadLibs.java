package tasks;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        //1. Get the season of the year
        System.out.println("Enter the season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Get a whole number
        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();

        //3. Get an adjective
        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        //4. Print the following: "On a [adjective][season of the year] day, I drink a minimum of [whole number]
        //   cups of coffee."

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
