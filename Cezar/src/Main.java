import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим: 1 - Шифрование, 2 - Расшифровка, 3 - Brute Force");
        int mode = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();

        // Проверка существования файла
        if (!Files.exists(Paths.get(filePath))) {
            System.out.println("Файл не найден.");
            return;
        }

        if (mode != 3) {
            System.out.print("Введите ключ (число от 1 до 32): ");
            int key = scanner.nextInt();
            // Валидация ключа
            if (key < 1 || key > 32) {
                System.out.println("Неверный ключ. Ключ должен быть числом от 1 до 32.");
                return;
            }

            switch (mode) {
                case 1:
                    encryptFile(filePath, key);
                    break;
                case 2:
                    decryptFile(filePath, key);
                    break;
                default:
                    System.out.println("Неверный режим.");
            }
        }
        else {
            bruteForceDecrypt(filePath);
        }
    }

    private static void encryptFile(String filePath, int key) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            String encrypted = shiftText(content, key);
            writeToFile(filePath.replace(".txt", "_encrypted.txt"), encrypted);
            System.out.println("Шифрование завершено. Результат сохранен в " + filePath.replace(".txt", "_encrypted.txt"));
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void decryptFile(String filePath, int key) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            String decrypted = shiftText(content, -key);
            writeToFile(filePath.replace(".txt", "_decrypted.txt"), decrypted);
            System.out.println("Расшифровка завершена. Результат сохранен в " + filePath.replace(".txt", "_decrypted.txt"));
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void bruteForceDecrypt(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            for (int key = 1; key <= 32; key++) {
                String decrypted = shiftText(content, -key);
                System.out.println("Ключ " + key + ": " + decrypted);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static String shiftText(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (ALPHABET.indexOf(c) != -1) {
                int idx = ALPHABET.indexOf(c);
                int shiftedIdx = (idx + key + ALPHABET.length()) % ALPHABET.length();
                result.append(ALPHABET.charAt(shiftedIdx));
            } else {
                result.append(c); // Неизменяем символы, не входящие в алфавит
            }
        }
        return result.toString();
    }

    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
