package OOD.Q7_Chat;

import java.util.Date;

public class Message {
    private Date date;
    private String message;
    private User user;

    public Message(Date date, String message, User user) {
        this.date = date;
        this.message = message;
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
