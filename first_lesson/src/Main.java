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

    // Задача 8
    private static void sumOfEvenNumbers(Scanner scanner) {
        System.out.print("Введите два целых числа A и B: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int evenSum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) evenSum += i;
        }
        System.out.println("Сумма чётных чисел от " + A + " до " + B + ": " + evenSum);
    }

    // Задача 9
    private static void reverseString(Scanner scanner) {
        System.out.print("Введите строку для реверса: ");
        scanner.nextLine();
        String str = scanner.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Обратный порядок строки: " + reversedStr);
    }

    // Задача 10
    private static void countDigits(Scanner scanner) {
        System.out.print("Введите целое число для подсчета цифр: ");
        int number = scanner.nextInt();
        int digitCount = String.valueOf(Math.abs(number)).length();
        System.out.println("Количество цифр: " + digitCount);
    }

    // Задача 11
    private static void calculateFactorial(Scanner scanner) {
        System.out.print("Введите целое число N для вычисления факториала: ");
        int N = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("Факториал " + N + ": " + factorial);
    }

    // Задача 12
    private static void sumOfDigits(Scanner scanner) {
        System.out.print("Введите целое число для подсчета суммы цифр: ");
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        while (number != 0) {
            sumOfDigits += Math.abs(number % 10);
            number /= 10;
        }
        System.out.println("Сумма цифр: " + sumOfDigits);
    }

    // Задача 13
    private static void checkPalindrome(Scanner scanner) {
        System.out.print("Введите строку для проверки на палиндром: ");
        String str = scanner.next();
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedCleanedStr = new StringBuilder(cleanedStr).reverse().toString();
        System.out.println(cleanedStr.equals(reversedCleanedStr) ? "Палиндром" : "Не палиндром");
    }

    // Задача 14
    private static void findMaxInArray(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        System.out.println("Максимальное число в массиве: " + max);
    }
}