import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main extends JFrame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game where you guess the number: ");

        Random random = new Random();
        int min = 1;
        int max = 100;

        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("The machine has randomly selected a number in the range from " + min + " to " + max + ". You have 5 attempts.");

        int attempts = 0;

        while (attempts < 5) {
            int number = scanner.nextInt();

            if (number < randomNumber) {
                System.out.println("The number is greater: ");
            } else if (number > randomNumber) {
                System.out.println("The number is smaller: ");
            } else {
                System.out.println("Congratulations! You found the number " + randomNumber);
                break;
            }

            attempts++;
            System.out.println("You have " + (5 - attempts) + " attempts remaining");
        }

        if (attempts == 5) {
            System.out.println("You were unable to guess the number: " + randomNumber);
        }

        scanner.close();
    }
}