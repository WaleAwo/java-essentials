package structures.control;

import java.util.Scanner;

public class ControlStructures {

    enum myChar {
        A,
        B
    }

    public static void main(String[] args) {
        ControlStructures cntrlStructures = new ControlStructures();
        cntrlStructures.ifCheck();
        cntrlStructures.ifElseCheck();
        cntrlStructures.forLoopCheck();
        cntrlStructures.forEachLoopCheck();
        cntrlStructures.nestedIfCheck();
        cntrlStructures.whileLoopCheck();
        cntrlStructures.switchCheck();
    }

    public void ifCheck(){
    // Use the if statement to specify a block of Java code to be executed if a condition is true

        int number = 10;

        if (number > 10){
            System.out.println(number + "is greater than 10");
        }
    }

    public void ifElseCheck() {
    // Use the else statement to specify a block of code to be executed if the condition is false.

        boolean flag = true;

        if (flag) {
            System.out.println("Print if flag is true.");
        } else {
            System.out.println("Print if flag is false.");
        }
    }

    public void nestedIfCheck(){
        int qualifiedSalary = 30000;
        int employmentDuration = 2;

        System.out.println("What is your yearly salary?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextInt();

        System.out.println("Emploment length?");
        double yearsEmployed = scanner.nextInt();
        scanner.close();

        if(salary >= qualifiedSalary){
            if (yearsEmployed >= employmentDuration){
                System.out.println("Congratulations, your loan is approved");
            }
            else {
                System.out.println("Sorry, your employment is less than " + employmentDuration
                + " years");
            }
        }else {
            System.out.println("Sorry, your salary is less than £" + qualifiedSalary);
        }
    }

    public void ifElseIfCheck(){
    // Use the else if statement to specify a new condition if the first condition is false.

        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();

        char grade;

        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if (score < 80){
            grade = 'C';
        }
        else if (score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        System.out.println("Your grade is: " + grade);
    }

    public void forLoopCheck() {
   /* use the for loop instead of a while loop When you know exactly how many times you
      want to loop through a block of code
    */

        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);

            if (i == 3) {
                break; // exit clause
            }
        }
    }

    public void forEachLoopCheck() {
        String[] myArray = {"a", "b", "c", "d"};

        for (String str : myArray) {
            System.out.println(str);
            if (str.equalsIgnoreCase("b")) {
                break; // exit clause
            }
        }
    }

    public void whileLoopCheck() {
    // The while loop loops through a block of code as long as a specified condition is true

        int j = 5;

        while (j > 0) {
            System.out.println("j is: " + j);
            j--;
            if (j == 3) {
                break;
            }
        }
    }

    public void doWhileCheck(){
    /* This loop will execute the code block once, before checking if the condition is true,
       then it will repeat the loop as long as the condition is true.
     */

        Scanner scanner = new Scanner(System.in);

        boolean again =false;

        do {
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double total = num1 + num2;
            System.out.println("The total is " + total);

            System.out.println("Would you liek to start over?");
            again = scanner.nextBoolean();

        }while (again);

        scanner.close();
    }

    public void switchCheck() {
        myChar nowChar = myChar.A;

        switch (nowChar) {
            case A:
                System.out.println(nowChar);
                break;
            case B:
                System.out.println(nowChar);
                break;
            default:
                System.out.println("Invalid property");
        }
    }
}
