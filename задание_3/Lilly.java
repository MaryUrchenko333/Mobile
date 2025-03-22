   import java.util.Random;
   import java.util.Scanner;

   public class Lilly {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           Random random = new Random();
           boolean playAgain;

           do {
               int targetNumber = random.nextInt(11); 
               int attempts = 3;
               boolean hasGuessedCorrectly = false;

               System.out.println("Я загадал число от 0 до 10. У тебя есть 3 попытки, чтобы угадать его.");

               for (int attempt = 1; attempt <= attempts; attempt++) {
                   System.out.print("Попытка " + attempt + ": Введите ваше число: ");
                   int userGuess = scanner.nextInt();

                   if (userGuess < 0 || userGuess > 10) {
                       System.out.println("Пожалуйста, введите число в диапазоне от 0 до 10.");
                       attempt--; 
                       continue;
                   }

                   if (userGuess == targetNumber) {
                       System.out.println("Поздравляю! Вы угадали число " + targetNumber + "!");
                       hasGuessedCorrectly = true;
                       break;
                   } else if (userGuess < targetNumber) {
                       System.out.println("Загаданное число больше.");
                   } else {
                       System.out.println("Загаданное число меньше.");
                   }
               }

               if (!hasGuessedCorrectly) {
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
   
