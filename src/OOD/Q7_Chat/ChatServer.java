package OOD.Q7_Chat;

import java.util.ArrayList;
import java.util.List;

/*
*  Handles the lifecycle of all chat rooms in the server.
* */

public class ChatServer {

    private List<Chatroom> chatrooms;

    public ChatServer() {
        chatrooms = new ArrayList<>();
    }

    public boolean sendMessage(int chatRoomId, Message message){
        //add message to chatRoom
        return false;
    }

    public boolean createChatRoom(int chatRoomId, List<User> users){
        Chatroom chatroom = new Chatroom(chatRoomId);
        return chatrooms.add(chatroom);
    }

    public boolean removeChatRoom(int chatRoomId){
        //search and remove based on id
        return false;
    }

}
