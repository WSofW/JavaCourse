public class Book {
    private int id;
    private String title;
    private String author;
    private int year;

    // Конструктор без параметров
    public Book() {
    }

    // Конструктор с параметрами (для добавления новой книги)
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Конструктор с параметрами (для обновления книги с ID)
    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Геттер для id
    public int getId() {
        return id;
    }

    // Сеттер для id
    public void setId(int id) {
        this.id = id;
    }

    // Геттер для title
    public String getTitle() {
        return title;
    }

    // Сеттер для title
    public void setTitle(String title) {
        this.title = title;
    }

    // Геттер для author
    public String getAuthor() {
        return author;
    }

    // Сеттер для author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Геттер для year
    public int getYear() {
        return year;
    }

    // Сеттер для year
    public void setYear(int year) {
        this.year = year;
    }

    // Переопределение метода toString для удобного отображения книги
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
