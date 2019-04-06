package cit260project;

import java.util.ArrayList;

import java.util.Scanner;
import java.io.File;

public class GenAuthSubMenu extends Menu {

	private final String FILEPATH = "Apostles.txt";

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
		return "Show list or add to file";
	}

	/**
	 * Provide the list of menu items.
	 * 
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] { new MenuItem('1', "Show list of General Authorities"),
				new MenuItem('2', "Add to the existing file"), new MenuItem('R', "Return to MainMenu") };
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
			System.out.println("Place holder for the readFile method");
			break;
		case '2':
			System.out.println("Placeholder for loadFile method");
			break;
		case 'R':
			return false;
		default:
			System.out.println("Invalid Entry");

		}

		return true;
	}

	/**
	 * store apostles to file
	 * 
	 * @param apostles
	 */
	public void storeApostles(ArrayList<GeneralAuthority> apostles) {
		

	}

	/**
	 * read apostles from file.
	 * 
	 * @return
	 */
	public ArrayList<GeneralAuthority> loadApostles() {

		ArrayList<GeneralAuthority> apostles = new ArrayList<>();

		return apostles;
	}

	/**
	 * Read Prophets from the file
	 * 
	 * @param scanner
	 * @return User input of Prophet
	 */
	private GeneralAuthority readProphet(Scanner scanner) {
		
		return null;
	}

	/**
	 * Read Apostles from file
	 * 
	 * @param scanner
	 * @return User input of Apostle
	 */
	private GeneralAuthority readApostle(Scanner scanner) {
		
		return null;
	}

	/**
	 * Read members of Seventy from file
	 * 
	 * @param scanner
	 * @return User input of Seventy
	 */
	private GeneralAuthority readSeventy(Scanner scanner) {
		
		return null;
	}
}