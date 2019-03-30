package cit260project;

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
        return "MAIN MENU";
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
        return new MenuItem[] { 
                new MenuItem('1', "Prophet"), 
                new MenuItem('2', "Apostle"),
                new MenuItem('3', "Seventy"),
                new MenuItem('4', "Sample"),
                new MenuItem('Q', "Quit Program") 
        };
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
                System.out.println("Place holder for database access method 1");
                break;
            case '2':
                System.out.println("Place holder for database access method 2");
                break;
            case '3':
                System.out.println("Place holder for database access method 3");
                break;
            case '4':
                System.out.println("Place holder for database access method 4");
                break;
                
            case 'Q':
                return false;
                
            default:
                System.out.println("Invalid Entry");
                    
       }
        
       return true;
    }

}

