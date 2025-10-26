package rvt;
import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {
        ex7();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start:");
        int start = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter End:");
        int end = Integer.valueOf(scanner.nextLine());

        System.out.println();
        System.out.println(start);
        while (true) {
            if (end > start) {
                start += 1;
                System.out.println(start);
            } else if (end < start) {
                start -= 1;
                System.out.println(start);
            } else {
                break;
            }
        }
    }
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = Integer.valueOf(scanner.nextLine());
        int loopN = N;

        int loopSum = 0;

        while (true) {
            if (loopN > 0) {
                loopSum += loopN;
                loopN -= 1;
            } else {
                break;
            }
        }

        int formulaSum = (N * (N + 1) / 2);

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);
    }
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = Integer.valueOf(scanner.nextLine());
        int loopN = N;
        
        int loopSumSquare = 0;
        int loopSumCube = 0;
        while (true) {
            if (loopN > 0) {
                loopSumSquare += loopN * loopN;
                loopSumCube += loopN * loopN * loopN;
                loopN -= 1;
            } else {
                break;
            }
        }

        int formulaSumSquare = (N * (N + 1) * (2 * N + 1)) / 6;
        int formulaSumCube = (((N * (N + 1))) / 2 * ((N * (N + 1)) / 2));

        System.out.println("Loop Sum (Square) = " + loopSumSquare);
        System.out.println("Formula Sum (Square) = " + formulaSumSquare);

        System.out.println("Loop Sum (Cube) = " + loopSumCube);
        System.out.println("Formula Sum (Cube) = " + formulaSumCube);   
    }
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter low:");
        int low = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter high:");
        int high = Integer.valueOf(scanner.nextLine());

        int sumHigh = ((high * (high + 1)) / 2);
        int sumLow = (((low - 1) * ((low - 1) + 1)) / 2);

        int sum = sumHigh - sumLow;

        System.out.println("Sum = " + sum);
    }
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        System.out.println();
        
        int characters = 0;
        int times = word.length();

        while (true) {
            if (times > characters) {
                System.out.println(word);
                characters += 1;
            } else {
                break;
            }
        }

    }
    public static void ex6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String first = scanner.nextLine();

        System.out.println("Enter second word:");
        String second = scanner.nextLine();

        System.out.print(first);

        int dotsNum = 30 - first.length() - second.length();
        int dots = 0;
        while (true) {
            if (dots < dotsNum) {
                System.out.print(".");
                dots += 1;
            } else {
                break;
            }
        }

        System.out.println(second);

    }
    public static void ex7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int characters = 0;
        int charCount = word.length();

        while (true) {
            if (characters < charCount) {
                System.out.println(word.charAt(characters));
                characters += 1;
            } else {
                break;
            }
        }
    }
}