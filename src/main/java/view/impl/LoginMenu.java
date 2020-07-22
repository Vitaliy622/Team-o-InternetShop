package view.impl;

import service.UserService;
import view.Menu;

import java.util.Scanner;

public class LoginMenu implements Menu {
    private UserService userService;
    Scanner input = new Scanner(System.in);

    @Override
    public void show() {
 Scanner scanner = new Scanner(System.in);
        System.out.println("Input your Login and Password:");
        System.out.println("login: ");
        String login = input.next();

        System.out.println("password: ");
        String password = input.next();


       // if(userService.login(login, password))
        //(we will uncomment this code block after UserService Realization.
           if (login!=null&& password!=null) {
            System.out.println("\n" +
                    "You are logged in successfully");
        }
        else
            {
            System.out.println("Wrong username/password");
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}