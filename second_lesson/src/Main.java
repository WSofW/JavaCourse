import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Main {

    // 1. Функция для нахождения максимума
    public static int findMax(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("Числа равны, выбрасывается исключение.");
        }
        return Math.max(a, b);
    }

    // 2. Калькулятор деления
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль.");
        }
        return (double) a / b;
    }

    // 3. Конвертер строк в числа
    public static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Строка не может быть конвертирована в целое число.");
        }
    }

    // 4. Проверка возраста
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150.");
        }
    }

    // 5. Нахождение корня
    public static double findSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно найти корень из отрицательного числа.");
        }
        return Math.sqrt(number);
    }

    // 6. Факториал
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно вычислить факториал отрицательного числа.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // 7. Проверка массива на нули
    public static void checkArrayForZeros(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит нули.");
            }
        }
    }

    // 8. Калькулятор возведения в степень
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной.");
        }
        return Math.pow(base, exponent);
    }

    // 9. Обрезка строки
    public static String trimString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки.");
        }
        return str.substring(0, length);
    }

    // 10. Поиск элемента в массиве
    public static int findElementInArray(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return num;
            }
        }
        throw new IllegalArgumentException("Элемент не найден в массиве.");
    }

    // 11. Конвертация в двоичную систему
    public static String convertToBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательные числа не могут быть конвертированы в двоичную систему.");
        }
        return Integer.toBinaryString(number);
    }

    // 12. Проверка делимости
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль.");
        }
        return a % b == 0;
    }

    // 13. Чтение элемента списка
    public static <T> T getElementFromList(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка.");
        }
        return list.get(index);
    }

    // 14. Парольная проверка
    public static void checkPassword(String password) {
        // Не знаю
    }

    // 15. Проверка даты
    public static void checkDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Некорректная дата.", date, 0);
        }
    }

    // 16. Конкатенация строк
    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null.");
        }
        return str1 + str2;
    }

    // 17. Остаток от деления
    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль.");
        }
        return a % b;
    }

    // 18. Квадратный корень
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно найти корень из отрицательного числа.");
        }
        return Math.sqrt(number);
    }

    // 19. Конвертер температуры
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля.");
        }
        return (celsius * 9/5) + 32;
    }

    // 20. Проверка строки на пустоту
    public static void checkStringIsEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или равна null.");
        }
    }
}
