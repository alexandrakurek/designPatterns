package command;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// DAO - data access object
public class UserDao {

  Map<Long, User> users = new HashMap<>();

  public boolean save(User user, Long id) {
    if (users.containsKey(id)) {
      System.out.println("User with id " + id + " laready exisits");
    }

//    boolean isUsernameDuplicated = false;
//    for (User savedUser : users.values()) {
//      if (savedUser.getUsername().equals(user.getUsername())) {
//        isUsernameDuplicated = true;
//        break;
//      }
//    }
//    if (isUsernameDuplicated) {
//      System.out.println("User with username " + user.getUsername() + " already exists!");
//      return false;
//    }

    if(users.values().stream()
        .anyMatch(savedUser -> savedUser.getUsername().equals(user.getUsername()))) {
      System.out.println("User with username " + user.getUsername() + " already exists!");
      return false;
    }

    users.put(id, user);
    System.out.println(String.format("Saving user %s with id %s", user, id));
    return true;
  }

  public boolean remove(Long id) {
    if (!users.containsKey(id)) {
      System.out.println("Cannot remove user with id " + id);
      return false;
    }
    System.out.println("Removing user with id " + id);
    users.remove(id);
    return true;
  }

  public User get(Long id) {
    System.out.println("Retrieving user with id " + id);
    return users.get(id);
  }

  public Collection<User> getAll() {
    System.out.println("Getting all users");
    return users.values();
  }
}
