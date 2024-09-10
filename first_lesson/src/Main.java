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

    // Задача 4
    private static void sumOfNumbers(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int sum = (N * (N + 1)) / 2;
        System.out.println("Сумма от 1 до " + N + ": " + sum);
    }

    // Задача 5
    private static void fibonacciNumbers(Scanner scanner) {
        System.out.print("Введите целое число N для Фибоначчи: ");
        int N = scanner.nextInt();
        int aFib = 0, bFib = 1;
        System.out.print("Первые " + N + " чисел Фибоначчи: ");
        for (int i = 0; i < N; i++) {
            System.out.print(aFib + " ");
            int nextFib = aFib + bFib;
            aFib = bFib;
            bFib = nextFib;
        }
        System.out.println();
    }

    // Задача 6
    private static void checkPrimeNumber(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        boolean isPrime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " является простым числом." : " не является простым числом."));
    }

    // Задача 7
    private static void printNumbersInReverse(Scanner scanner) {
        System.out.print("Введите целое число N для обратного порядка: ");
        int N = scanner.nextInt();
        System.out.print("Числа от " + N + " до 1: ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}