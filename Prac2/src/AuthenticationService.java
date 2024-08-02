import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;
    public AuthenticationService(ArrayList<User> newusers){
        users = new ArrayList<User>();
        users = newusers;
    }
    @Override
    public User signUp(String username, String password) {
        User tem = new User(username,password);
        for (int i=0; i<users.size();i++) {
            if (users.get(i).getUsername().equals(username)) {
                return null;
            }
        }
        users.add(tem);
        return tem;
    }

    @Override
    public User logIn(String username, String password) {
        User tem = new User(username,password);
        for (int i=0; i<users.size();i++) {
            User comparing_user = users.get(i);
            if (comparing_user.getUsername().equals(username) && comparing_user.getPassword().equals(password)){
                return comparing_user;
            }
        }
        return null;
    }

    // TODO Now: Add a constructor to initialize the users list with the default user

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
}