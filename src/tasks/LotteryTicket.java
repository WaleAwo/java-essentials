package tasks;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers(); // call the method & store numbers
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH]; // create an array of numbers
        Random random = new Random(); // generate a random number

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            /*
            Search random numbers to ensure there are no duplicates. If it does,
            regenerate numbers
             */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false it not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        // Enhanced loop. It iterates through 'array' and assigns the current element to 'value'
        for(int value: array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        return false; // no matching values found
    }

    public static void printTicket(int[] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + ", ");
        }
    }
}
