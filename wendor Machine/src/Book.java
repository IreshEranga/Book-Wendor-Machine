
import java.util.HashSet;
import java.util.Set;

class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private int quantity;
    private final Set<String> borrowers;

    public Book(String isbn, String title, String author, int quantity) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.borrowers = new HashSet<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public Set<String> getBorrowers() {
        return borrowers;
    }

    public void addBorrower(String nic) {
        borrowers.add(nic);
    }

    public void removeBorrower(String nic) {
        borrowers.remove(nic);
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}