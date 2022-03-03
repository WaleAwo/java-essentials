package structures.control;

public class ControlStructures {

    enum myChar {
        A,
        B
    }

    public static void main(String[] args) {
        ControlStructures cntrlStructures = new ControlStructures();
        cntrlStructures.ifElseCheck();
        cntrlStructures.forLoopCheck();
        cntrlStructures.forEachLoopCheck();
        cntrlStructures.whileLoopCheck();
        cntrlStructures.switchCheck();
    }

    public void ifElseCheck() {
        boolean flag = true;

        if (flag) {
            System.out.println("Print if flag is true.");
        } else {
            System.out.println("Print if flag is false.");
        }
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
        }
    }
}
