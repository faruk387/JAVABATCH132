package b132practices.practice07;

import java.util.Random;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 0-100");
        int number;
        int randomNumber = (int) (Math.random() * 101);
        //System.out.println("randomNumber = " + randomNumber);
        int counter = 0;

        do {
            counter++;
            number = scanner.nextInt();
            if (number < randomNumber) {
                System.out.println("You failed! You have " + (10 - counter) + " more guesses! Enter a greater number");
            } else if (number > randomNumber) {
                System.out.println("You failed! You have " + (10 - counter) + " more guesses! Enter a smaller number");
            } else {
                System.out.println("Congratulations! You found the number in " + counter + " guesses!!!");
                System.out.println("Your point: " + (11 - counter) * 10);
            }

            if (counter == 10) {
                System.out.println("Game Over!!! If you want to play again enter 1 otherwise enter any other number to exit.");
                System.out.println("randomNumber = " + randomNumber);
                if (scanner.nextInt() == 1) {
                    System.out.println("Enter an integer between 0-100");
                    counter = 0;
                    randomNumber = (int) (Math.random() * 101);

                } else {
                    break;
                }
            }

        } while (number != randomNumber);
        System.out.println("Bye bye!!!");

    }
}




