package OOD.Q7_Chat;

import java.util.ArrayList;
import java.util.List;

/*
* User has all the info that describe a user of the chat room, in addition to the list of chat rooms that is participating.
* */
public class User {

    private int id;
    private Status userStatus;
    private List<Chatroom> chatroomsParticipating;

    public User(int id) {
        this.id = id;
        userStatus = Status.Offline;
        chatroomsParticipating = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Status getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Status userStatus) {
        this.userStatus = userStatus;
    }

    public List<Chatroom> getChatroomsParticipating() {
        return chatroomsParticipating;
    }

    public boolean addChatroom(Chatroom chatroom){
        return chatroomsParticipating.add(chatroom);
    }

    public boolean removeFromChatroom(Chatroom chatroom){
       return chatroomsParticipating.remove(chatroom);
    }

}
