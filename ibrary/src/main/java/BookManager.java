import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager implements AutoCloseable {
    private Connection connection;

    public BookManager(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public void addBook(Book book) throws SQLException {
        String sql = "INSERT INTO books (title, author, year) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setInt(3, book.getYear());
            pstmt.executeUpdate();
        }
    }

    public List<Book> getAllBooks() throws SQLException {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setYear(rs.getInt("year"));
                books.add(book);
            }
        }
        return books;
    }

    public void updateBook(Book book) throws SQLException {
        String sql = "UPDATE books SET title = ?, author = ?, year = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setInt(3, book.getYear());
            pstmt.setInt(4, book.getId());
            pstmt.executeUpdate();
        }
    }

    public void deleteBook(int id) throws SQLException {
        String sql = "DELETE FROM books WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    @Override
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
