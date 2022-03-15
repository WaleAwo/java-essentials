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
        int number = 10;

        if (number > 10){
            System.out.println(number + "is greater than 10");
        }
    }

    public void ifElseCheck() {
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
        int j = 5;

        while (j > 0) {
            System.out.println("j is: " + j);
            j--;
            if (j == 3) {
                break;
            }
        }
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
