package cit260project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainMenu extends Menu {

    /**
     * Default constructor. Does nothing.
     */
    public MainMenu() {
        super();
    }

    /**
     * Provide the menu title (or null to skip).
     * 
     * @return
     */
    @Override
    protected String getTitle() {
        return "\n----------\nMAIN MENU\n----------";
    }

    /**
     * Provide a menu description (or null to skip).
     * 
     * @return
     */
    @Override
    protected String getDescription() {
        return "Welcome to the General Authority Database. \nPlease choose from the options below.";
    }

    /**
     * Provide the list of menu items.
     * 
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] { new MenuItem('1', "Prophet"), new MenuItem('2', "Apostle"),
                new MenuItem('3', "Seventy"), new MenuItem('4', "Sample"), new MenuItem('Q', "Quit Program") };
    }

    /**
     * Handle the user's menu selection.
     * 
     * @return false if the menu should exit and return to whatever called it.
     */
    @Override
    protected boolean handleMenuSelection(char key) {
        switch (Character.toUpperCase(key)) {
        case '1':
            subMenu();
            break;
        case '2':
            subMenu();
            break;
        case '3':
            subMenu();
            break;
        case '4':
            sampleFile();
            prompt("Press enter to continue.\n\n\n");
            break;
        case 'Q':
            return false;

        default:
            System.err.println("\n\nInvalid Entry");

        }

        return true;
    }


    private void subMenu() {
        Menu subMenu = new GenAuthSubMenu();
        subMenu.display();
    }

    private void sampleFile() {
        File sampleFile = new File("Sample.txt");
        readFile(sampleFile);
    }

    // Method to read from existing file and print the the console
    public Scanner readFile(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            System.out.println();
            
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("\n\nError finding example file.");
        }
        System.out.println();
        return scanner;
    }

}
