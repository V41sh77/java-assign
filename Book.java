public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String bookIsbn;
    private boolean isAvailable;  
      
    // Default constructor
    public Book() {
    this.bookTitle = "Unknown";
    this.bookAuthor = "Unknown";
    this.bookIsbn = "0000000000";
    this.isAvailable = true;
}
    public Book(String title, String author, String isbn) {
        setBookTitle(title);
        setBookAuthor(author);
        setBookIsbn(isbn);
        this.isAvailable = true;
    }
