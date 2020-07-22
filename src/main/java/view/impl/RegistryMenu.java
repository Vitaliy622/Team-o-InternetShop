package view.impl;

import service.UserService;
import view.Menu;

import javax.naming.NamingEnumeration;
import java.util.Scanner;

public class RegistryMenu implements Menu {
    private UserService userService;
    Scanner input = new Scanner(System.in);

    @Override
    public void show() {
        System.out.println("Input your future Login and Password:");
        System.out.println("login: ");
        String login = input.next();

        System.out.println("password: ");
        String password = input.next();

        if (login!=null&& password!=null) {
            System.out.println("\n" +
                    "You are registered successfully");
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
