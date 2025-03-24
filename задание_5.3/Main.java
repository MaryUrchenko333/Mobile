import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        try {
            checkString(input);
            System.out.println("Строка принята: " + input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkString(String str) {
        if (str.matches(".*\\d.*")) { 
            throw new IllegalArgumentException("Строка не должна содержать число!");
        }
    }
}
