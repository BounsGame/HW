import java.util.Objects;

public class Book {
    private final String bookName;
    private Author author;
    int year;

    public Book(String bookName, int year, Author author) {
        this.bookName = bookName;
        this.year = year;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bookName);
    }

    @Override
    public String toString() {
        return "книга " + bookName + ", " + author + ", " + year + " года выпуска";
    }
}

