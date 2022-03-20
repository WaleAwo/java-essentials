package tasks;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers(); // call the method & store numbers
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH]; // create an array of numbers
        Random random = new Random(); // generate a random number

        for (int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1; // assign & generate a number between 1 and 69
        }
        return ticket;
    }

    public static void printTicket(int[] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + ", ");
        }
    }
}
