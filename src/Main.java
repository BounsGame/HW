import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задание
        String name = "Stiven";
        String surname = "King";
        int year = 1986;
        String bookname = "It";
        Author author1 = new Author(name, surname);
        Book book1 = new Book(bookname, year, author1);
        Author author2 = new Author("Robert", "Martin");
        Book book2 = new Book("Clear code", 2025, author2);
        System.out.println(book1.getBookName() + " " + book1.getYear() + " " + book1.author.getName() + " " + book1.author.getSurname());
        System.out.println(book2.getBookName() + " " + book2.getYear() + " " + book2.author.getName() + " " + book2.author.getSurname());
        book1.setYear(2024);
        System.out.println(book1.getBookName() + " " + book1.getYear() + " " + book1.author.getName() + " " + book1.author.getSurname());
    }
}
