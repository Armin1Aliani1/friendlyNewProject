package newProject;

import newProject.util.Menu;

public class ApplicationOnlineShop {

    public static void main(String[] args) {
        Menu.printMainMenu();
        int selection = Menu.selectMainMenu();

        if (selection == 1) {
            // Login admin
        } else {
            // Login costumer
        }

    }
}
