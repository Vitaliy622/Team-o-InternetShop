package view.impl;

import service.UserService;
import view.Menu;

import java.util.Scanner;

public class LoginOrRegistryMenu implements Menu {
    private final String[] registryItems = {"1.Login", "2.Registry"};
    private Scanner scanner;

    @Override
    public void show() {
        showItems(registryItems);
        System.out.println("0. Return");

        while (true) {
            scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    new LoginMenu().show();
                case 2:
                    new RegistryMenu().show();

                case 0:
                    new ChooseUserMenu().show();
            }
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }

}