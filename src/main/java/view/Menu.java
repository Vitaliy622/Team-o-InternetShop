package view;

public interface Menu {
    void show();

    void exit();

    default void showItems(String[]i) {
        for (String item : i) {
            System.out.println("-------------");
            System.out.println(item);
        }
        System.out.println("-------------");
    }
}