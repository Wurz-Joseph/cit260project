package cit260project;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.PrintWriter;

public class GenAuthSubMenu extends Menu {
	private final String FILEPATH = "Apostles.txt";

	public GenAuthSubMenu() {
		super();
	}

	/**
	 * Provide a menu description (or null to skip).
	 * 
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "\nShow list or add to file";
	}

	/**
	 * Provide the list of menu items.
	 * 
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] { new MenuItem('1', "Show list of General Authorities"),
				new MenuItem('2', "Add General Authority to the file"), new MenuItem('R', "Return to Main Menu") };
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
			// load from external file
			File gaFile = new File("Apostles.txt");
			readApostles(gaFile);
			break;
		case '2':
			storeApostles(apostles);
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
	ArrayList<GeneralAuthority> apostles = new ArrayList<GeneralAuthority>();

	public void storeApostles(ArrayList<GeneralAuthority> apostles) {

		// prompt to add G.A. data and read in values.
		System.out.print("Title(Prophet, Apostle, Seventy): ");
		String title = scanner.nextLine();

		System.out.print("Full Name: ");
		String name = scanner.nextLine();

		// validate that a name has been entered. If not prompt for name again.
		while (name.length() == 0) {
			if (name.length() == 0) {
				System.err.println("\nName cannot be empty.");
				System.out.println("Full Name: ");
				name = scanner.nextLine();
			}
		}

		System.out.print("Office(President, Elder): ");
		String office = scanner.nextLine();

		System.out.print("Date of Birth: ");
		String dateOfBirth = scanner.nextLine();

		System.out.print("Date of Sustained: ");
		String dateSustained = scanner.nextLine();

		System.out.print("A Favorite Quote: ");
		String favoriteQuote = scanner.nextLine();

		// create new G.A. object
		GeneralAuthority ga = new GeneralAuthority(title, name, office, dateOfBirth, dateSustained, favoriteQuote);
		// add object to apostles arrayList
		apostles.add(ga);

		try {
			// create/append to Apostles.txt
			PrintWriter pw = new PrintWriter(new FileOutputStream(new File(FILEPATH), true));
			// print to file
			pw.println(apostles.toString());
			pw.close();

			System.out.println("\n" + ga.getName() + " was Successfully added to the database.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * read apostles from file.
	 * 
	 * @return
	 */
	public ArrayList<GeneralAuthority> loadApostles() {
		System.out.println(apostles.toString());

		return apostles;
	}

	/**
	 * Read GeneralAuthorities from the file
	 * 
	 * @param scanner
	 * @return User input of Prophet
	 */
	private Scanner readApostles(File file) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			// if file is empty display error. Else display list of Apostles.
			if (file.length() == 0) {
				System.err.println("\nNo General Authorities currently in the database. Try adding one to the file.\n");
			} else {
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
			}

		} catch (FileNotFoundException e) {
			System.err.println("Error finding file.");
			// display menu if file not found
			display();
		}
		return scanner;
	}

}