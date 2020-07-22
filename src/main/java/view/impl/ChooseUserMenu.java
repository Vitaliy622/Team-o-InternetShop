package view.impl;


import service.UserService;
import view.Menu;

import java.util.Scanner;

public class ChooseUserMenu implements Menu {
    private final String[] items = {"1.Customer", "2.Admin"};
    private Scanner scanner;

    @Override
    public void show() {
        showItems(items);
        System.out.println("0. Exit");


        while (true) {
            scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            LoginOrRegistryMenu registryOrLoginMenu = new LoginOrRegistryMenu();

            switch (choice) {
                case 1:
                    registryOrLoginMenu.show();
                    break;
                case 2:
                    registryOrLoginMenu.show();
                    break;
                case 0:
                    exit();
                    break;
            }
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}