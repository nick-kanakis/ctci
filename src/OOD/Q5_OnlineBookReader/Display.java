package OOD.Q5_OnlineBookReader;

/**
 * Created by Nicolas on 16/12/2017.
 */
public class Display {

    private User activeUser;
    private Book activeBook;

    public Display() {
    }

    public Display(User activeUser) {
        this.activeUser = activeUser;
    }

    public Display(Book activeBook) {
        this.activeBook = activeBook;
    }

    public Display(User activeUser, Book activeBook) {
        this.activeUser = activeUser;
        this.activeBook = activeBook;
    }

    public void displayBook(Book activeBook) {
        //display book
    }

    public void displayUser(User activeUser) {
        //display user
    }
}
