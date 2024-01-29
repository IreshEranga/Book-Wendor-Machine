
import java.util.HashSet;
import java.util.Set;


class Library {
    private final Set<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Set<Book> getAllBooks() {
        return books;
    }
}