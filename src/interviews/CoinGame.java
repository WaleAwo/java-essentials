package interviews;

import java.util.Scanner;

public class CoinGame {
    public static void main(String[] args) {
        
        int magicNumber = 1;
        double onePence = .01;
        double fivePence = .05;
        double tenPence = .10;
        double twentyPence = .20;

        System.out.println("Guess the coin amount to win the game.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies?");
        int noOfPennies = scanner.nextInt();

        System.out.println("How many five pence?");
        int noOfFivePence = scanner.nextInt();

        System.out.println("How many ten pence?");
        int noOfTenPence = scanner.nextInt();

        System.out.println("How many twenty pence?");
        int noOfTwentyPence = scanner.nextInt();

        scanner.close();

        double guess = onePence * noOfPennies + fivePence * noOfFivePence + tenPence * noOfTenPence +
                twentyPence * noOfTwentyPence;

        if (guess > magicNumber){
            double overAmount = guess - magicNumber;
            System.out.printf("Sorry, you are over by %.2f", overAmount);
        }else if(guess < magicNumber) {
            double underAmount = magicNumber - guess;
            System.out.printf("Sorry, you are under by %.2f", underAmount);
        }else {
            System.out.println("Congratulations, you win!");
        }
    }
}
