package org.amitd.main;

import org.amitd.service.UserService;
import org.amitd.entity.User;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static User user;
    public static Main main = new Main();

    public static void main (String [] args){

        UserService userService = new UserService();

        System.out.println("Enter the username");
        String username = scanner.next();

        System.out.println("Enter the password");
        String password = scanner.next();

        userService.printUsers();
        user = userService.login(username, password);

        if (user != null){
            System.out.println("Login Successful!");
        }
        else{
            System.out.println("Login Failed!");
        }
    }

    public void initAdmin(){

    }

    public void initCustomer(){

    }

}

