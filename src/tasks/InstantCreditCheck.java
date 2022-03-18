package tasks;

import java.util.Scanner;

public class InstantCreditCheck {

    // initialize what you know - global variables
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // get what you don't know
        double salary = getSalary(); // store returned value
        int creditScore = getCreditScore(); // store returned value
        scanner.close(); // store returned value

        // check if user is qualified
        boolean isQualified = isUserQualified(salary, creditScore); // methods arguments

        // notify user
        notifyUser(isQualified);
    }
    public static double getSalary(){
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary; // return the value back to the main method
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore; // return the value back to the main method
    }

    public static boolean isUserQualified(double salary, int creditScore){ // required parameters for the method
        if(salary >= requiredSalary && creditScore >= requiredCreditScore){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){ // required parameters for the method
        if (isQualified){
            System.out.println("Congratulations, you've passed");
        }
        else {
            System.out.println("Sorry, you've been declined");
        }
    }
}
