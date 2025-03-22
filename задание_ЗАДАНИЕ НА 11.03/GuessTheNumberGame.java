import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            
            int maxNumber = 10;  
            int attempts = 3;     

            
            int targetNumber = random.nextInt(maxNumber + 1);
            boolean hasGuessedCorrectly = false;

            System.out.println("Я загадал число от 0 до " + maxNumber + ". У тебя есть " + attempts + " попытки, чтобы угадать его.");

            
            for (int i = 0; i < attempts; i++) {
                System.out.print("Попытка " + (i + 1) + ": Введите ваше число: ");
                int userGuess = scanner.nextInt();

                if (userGuess < 0 || userGuess > maxNumber) {
                    System.out.println("Пожалуйста, введите число в диапазоне от 0 до " + maxNumber + ".");
                    i--; 
                    continue;
                }

                if (userGuess == targetNumber) {
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Загаданное число больше.");
                } else {
                    System.out.println("Загаданное число меньше.");
                }
            }

            
            if (hasGuessedCorrectly) {
                System.out.println("Поздравляю! Вы угадали число " + targetNumber + "!");
            } else {
                System.out.println("К сожалению, вы не угадали. Загаданное число было " + targetNumber + ".");
            }

            
            System.out.print("Повторить игру еще раз? 1 - да, 0 - нет: ");
            int repeat = scanner.nextInt();
            playAgain = (repeat == 1);

        } while (playAgain);

        System.out.println("Спасибо за игру!");
        scanner.close();
    }
}
