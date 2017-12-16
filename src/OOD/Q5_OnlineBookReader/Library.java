package OOD.Q5_OnlineBookReader;

import java.util.HashMap;

/**
 * The Library class is responsible for handling the lifecycle of Book objects available in the book store.
 */
public class Library {
    private HashMap<Integer, Book> bookHashMap;

    public Library() {
        this.bookHashMap = new HashMap<>();
    }

    public HashMap<Integer, Book> getBooks() {
        return bookHashMap;
    }
    public Book getBook(int isbn){
        return this.bookHashMap.get(isbn);
    }
    public Book removeBook(int isbn){
        return this.bookHashMap.remove(isbn);
    }

    public void addNewBook(int isbn, Book book) {
        this.bookHashMap.put(isbn, book);
    }
}
