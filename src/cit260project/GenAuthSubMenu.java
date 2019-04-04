package cit260project;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

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
		return "Show list or add to existing file";
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
			System.out.println("Place holder for the addToFile method");
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
	 * @param apostles
	 */
	public void storeApostles(ArrayList<GeneralAuthority> apostles) {
		File textFile = new File(FILEPATH);

		try (PrintWriter out = new PrintWriter(new FileOutputStream(textFile))) {

		} catch (FileNotFoundException exception) {
			System.err.println("Could not find file path");

		}

	}
	
	/**
	 * read apostles from file.
	 * @return
	 */
	public ArrayList<GeneralAuthority> loadApostles() {

		ArrayList<GeneralAuthority> apostles = new ArrayList<>();

		return apostles;
	}
	
}