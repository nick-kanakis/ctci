package OOD.Q5_OnlineBookReader;

/**
 * Wrapper class for all functionalities and the main interface of the bookstore. We make a assumption that there is
 * only one active user/book each moment.
 */
public class OnlineReaderSystem {
    private Library library;
    private UserManagement userManagement;
    private User activeUser;
    private Book activeBook;
    private Display display;

    public OnlineReaderSystem() {
        this.library = new Library();
        this.userManagement = new UserManagement();
        this.display = new Display();
    }

    public Library getLibrary() {
        return library;
    }

    public UserManagement getUserManagement() {
        return userManagement;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
        display.displayUser(activeUser);
    }

    public Book getActiveBook() {
        return activeBook;
    }

    public void setActiveBook(Book activeBook) {
        this.activeBook = activeBook;
        display.displayBook(activeBook);
    }
}
