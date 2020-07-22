package view.impl;


import view.Menu;

public class UserMainMenu implements Menu {
    @Override
    public void show() {
        System.out.println();
    }

    @Override
    public void exit() {
        new ChooseUserMenu().show();
    }
}