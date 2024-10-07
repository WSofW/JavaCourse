import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/library";
        String user = "postgres";
        String password = "root";

        try (BookManager manager = new BookManager(url, user, password);
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("1. Добавить книгу");
                System.out.println("2. Просмотреть все книги");
                System.out.println("3. Обновить книгу");
                System.out.println("4. Удалить книгу");
                System.out.println("0. Выход");
                System.out.print("Выберите действие: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера

                switch (choice) {
                    case 1:
                        // Добавление книги
                        System.out.print("Название: ");
                        String title = scanner.nextLine();
                        System.out.print("Автор: ");
                        String author = scanner.nextLine();
                        System.out.print("Год издания: ");
                        int year = scanner.nextInt();
                        manager.addBook(new Book(title, author, year));
                        break;

                    case 2:
                        // Просмотр всех книг
                        List<Book> books = manager.getAllBooks();
                        for (Book book : books) {
                            System.out.println(book.getId() + ": " + book.getTitle() + " - " + book.getAuthor() + " (" + book.getYear() + ")");
                        }
                        break;

                    case 3:
                        // Обновление книги
                        System.out.print("Введите ID книги для обновления: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // Очистка буфера
                        System.out.print("Новое название: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Новый автор: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Новый год издания: ");
                        int newYear = scanner.nextInt();
                        manager.updateBook(new Book(updateId, newTitle, newAuthor, newYear));
                        break;

                    case 4:
                        // Удаление книги
                        System.out.print("Введите ID книги для удаления: ");
                        int deleteId = scanner.nextInt();
                        manager.deleteBook(deleteId);
                        break;

                    case 0:
                        return;

                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
