package org.amitd.repository;

import org.amitd.entity.User;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRepository {
    static Set<User> userList = new HashSet<User>();

    static {
        User user1 = new User("admin", "admin", "987654321", "admin", 0.0);
        User user2 = new User("user1", "user1", "987654312", "user", 100.0);
        User user3 = new User("user2", "user2", "987654221", "user", 200.0);
        User user4 = new User("user3", "user3", "987654421", "user", 300.0);
        User user5 = new User("user4", "user4", "987654321", "admin", 0.0);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
    }

    public void printUsers() {
        System.out.println(userList);
    }

    public User login(String username, String password) {

        List<User> finalUser = userList.stream()
                .filter(item -> item.getUsername().equals(username) && item.getPassword().equals(password))
                .toList();

        if(!finalUser.isEmpty()){
            return finalUser.getFirst();
        }
        else {
            return null;
        }
    }

    public boolean addCustomer(String username, String password, String contactNumber){
        User user = new User(username, password, contactNumber, "user", 500.0);
        return userList.add(user);
    }
}
