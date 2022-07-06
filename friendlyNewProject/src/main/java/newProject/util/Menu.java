package newProject.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static Scanner scanner;

    public static void printMainMenu() {
        System.out.println("Menu");
        System.out.println("1.Login as admin");
        System.out.println("2.Login as costumer");
    }

    public static int numberScaner() {
        int selection;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                selection = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please just enter number");
            }
        }
        return selection;
    }

    public static int selectMainMenu() {
        int selection = 0;
        while (selection < 1 || selection > 2) {
            selection = numberScaner();
            if (selection < 1 || selection > 2) {
                System.out.println("Please enter 1 or 2");
            }
        }
        return selection;
    }

    public static void printEnterUsername() {
        System.out.println("Enter username : ");
    }

    public static String stringScaner() {
        String selection = "";
        while (selection.isEmpty()) {
            scanner = new Scanner(System.in);
            selection = scanner.next();
        }
        return selection;
    }
}
