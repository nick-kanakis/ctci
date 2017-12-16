package OOD.Q5_OnlineBookReader;

import java.util.HashMap;

/**
 * UserManagement class manages the available users in the book store.
 */
public class UserManagement {
    private HashMap<Integer, User> userMap;

    public UserManagement() {
        this.userMap = new HashMap<>();
    }

    public User addUser(String password, String username, int id){
        //check for null input
        User user = new User(id, username, password) ;
        return userMap.put(user.getId(), user);
    }


    public User addUser(User newUser){
        //check userId is not null
        return userMap.put(newUser.getId(), newUser);
    }

    public User removeUser(int userId){
        return userMap.remove(userId);
    }

}
