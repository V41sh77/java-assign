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
 // Getters and Setters 
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.bookTitle = title.trim();
        } else {
            this.bookTitle = "Unknown";
        }
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.bookAuthor = author.trim();
        } else {
            this.bookAuthor = "Unknown";
        }
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String isbn) {
        if (isbn != null) {
            String cleanIsbn = isbn.trim();
            if (cleanIsbn.length() == 10 || cleanIsbn.length() == 13) {
                this.bookIsbn = cleanIsbn;
                return;
            }
        }
        this.bookIsbn = "0000000000";
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }
