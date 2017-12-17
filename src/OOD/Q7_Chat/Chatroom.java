package OOD.Q7_Chat;

import java.util.ArrayList;
import java.util.List;

/*
*  Chatroom has a list of User and Message objects. It handles the communication between 2+ users.
* */
public class Chatroom {
    private List<User> users;
    private List<Message> messages;
    private int id;

    public Chatroom(int id) {
        this.id = id;
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public int getId() {
        return id;
    }

    public boolean addUserToChatroom(User user){
        return users.add(user);
    }

    public boolean addNewMessage(Message message){
        return messages.add(message);
    }

}
