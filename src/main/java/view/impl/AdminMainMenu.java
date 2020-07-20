package view.impl;


import view.Menu;

public class AdminMainMenu implements Menu {
    @Override
    public void show() {
        System.out.println("");
    }

    @Override
    public void exit() {
        new LoginMenu().show();
    }
}