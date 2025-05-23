package org.amitd.service;

import org.amitd.entity.User;
import org.amitd.repository.UserRepository;

public class UserService {

    UserRepository userRepository = new UserRepository();

    public void printUsers() {
        userRepository.printUsers();
    }

    public User login(String username, String password){
        return userRepository.login(username, password);
    }
}
