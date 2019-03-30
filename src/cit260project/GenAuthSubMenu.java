package cit260project;

public class GenAuthSubMenu extends Menu {
    
    public GenAuthSubMenu() {
        super();
    }
    
    /**
     * Provide the menu title (or null to skip).
     * 
     * @return
     */
    @Override
    protected String getTitle() {
        return "Display General Authorities";
    }

    /**
     * Provide a menu description (or null to skip).
     * 
     * @return
     */
    @Override
    protected String getDescription() {
        return "Show list or add to existing file";
    }

    /**
     * Provide the list of menu items.
     * 
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] { 
                new MenuItem('1', "Show list of General Authorities"), 
                new MenuItem('2', "Add to the existing file"),
                new MenuItem('R', "Return to MainMenu") 
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
                System.out.println("Place holder for the getFile method");
                break;
            case '2':
                System.out.println("Place holder for the addToFile method");
                break;
                
            case 'R':
                return false;
                
            default:
                System.out.println("Invalid Entry");
                    
       }
        
       return true;
    }

}