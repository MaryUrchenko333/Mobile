public class Main {
    public static void main(String[] args) {
        // Примеры использования методов
        greet("Мария");
        System.out.println("Число -5 отрицательное? " + isNegative(-5));
        printSign(10);
        printMultiplesOfThree();
    }

    public static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printSign(int number) {
        if (number < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число положительное.");
        }
    }

    public static void printMultiplesOfThree() {
        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
