
import javax.swing.SwingUtilities;

    
public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("123", "Book Title 1", "Author 1", 5);
        Book book2 = new Book("456", "Book Title 2", "Author 2", 3);
        Book book3 = new Book("789", "Book Title 3", "Author 3", 2);
        Book book4 = new Book("111", "Book Title 4", "Author 2", 13);
        Book book5 = new Book("586", "Book Title 5", "Author 1", 6);
        
        
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Display the GUI for the borrower
        SwingUtilities.invokeLater(() -> {
            new BorrowBookGUI(library).setVisible(true);
        });
    }
}
    

