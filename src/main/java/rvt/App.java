package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Statistics 
        // part 1
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());

        // part 2
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

        // part 3
        Statistics userInput = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            } 

            userInput.addNumber(number);
        }

        System.out.println("Sum: " + userInput.sum());

        // part 4
        Statistics allNumber = new Statistics();
        Statistics evenNumber = new Statistics();
        Statistics oddNumber = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            allNumber.addNumber(number);

            if (number % 2 == 0) {
                evenNumber.addNumber(number);;
            } else {
                oddNumber.addNumber(number);
            }
        }
        
        System.out.println("Sum: " + allNumber.sum());
        System.out.println("Sum of even numbers: " + evenNumber.sum());
        System.out.println("Sum of odd numbers: " + oddNumber.sum());

        // Payment Card
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
