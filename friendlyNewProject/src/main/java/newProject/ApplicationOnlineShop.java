package newProject;

import newProject.util.ApplicationContext;
import newProject.util.Menu;

public class ApplicationOnlineShop {

    public static void main(String[] args) {

        Menu.printMainMenu();
        int selection = Menu.selectMainMenu();

        if (selection == 1) {
            ApplicationContext.adminService.login();
            Menu.printAdminMenu();
            selection = Menu.selectAminMenu();
            if (selection==1){
                // Add product
            }else {
                // Delete product
            }
        } else {
            // Login costumer
        }

    }
}
