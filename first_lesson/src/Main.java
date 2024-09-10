import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    // Задача 1
    private static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "Четное" : "Нечётное");
    }

    // Задача 2
    private static void findMinimumOfThree(Scanner scanner) {
        System.out.print("Введите три целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Минимальное число: " + Math.min(a, Math.min(b, c)));
    }

    // Задача 3
    private static void multiplicationTable() {
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
}