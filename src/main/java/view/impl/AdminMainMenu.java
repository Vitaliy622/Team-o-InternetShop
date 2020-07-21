package view.impl;


import view.Menu;

public class AdminMainMenu implements Menu {
    private String[] items = {"1.UsersMenu", "2.OrdersMenu", "3.ProductsMenu"};

    @Override
    public void show() {
        System.out.println("");
    }

    @Override
    public void exit() {
        new LoginMenu().show();
    }


}