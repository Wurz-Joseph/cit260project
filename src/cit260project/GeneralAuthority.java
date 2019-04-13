package cit260project;

/**
 * The General Authority model in our program.
 * 
 * @author David Barney
 *
 */
public class GeneralAuthority extends Menu {
	private String name;
	private String dateOfBirth;
	private String office;
	private String gaTitle;
	private String dateSustained;
	private String favoriteQuote;

	/**
	 * Constructor for a Person object.
	 * 
	 * @param name (Cannot be null)
	 * 
	 */
	public GeneralAuthority(String gaTitle, String name, String office, String dateOfBirth, String dateSustained,
			String favoriteQuote) {

		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.office = office;
		this.gaTitle = gaTitle;
		this.dateSustained = dateSustained;
		this.favoriteQuote = favoriteQuote;
	}

	/**
	 * Provide the person's name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Provide the person's date of birth
	 * 
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * 
	 * @return office (Prophet, Apostle, Seventy)
	 */
	public String getOffice() {
		return office;
	}

	/**
	 * @return the gaTitle
	 */
	public String getGaTitle() {
		return gaTitle;
	}

	/**
	 * 
	 * @return date sustained
	 */
	public String getDateSustained() {
		return dateSustained;
	}

	/**
	 * 
	 * @return favorite quote
	 */
	public String getFavoriteQuote() {
		return favoriteQuote;
	}

	/**
	 * override the toString method for printing/storing objects to file.
	 */
	@Override
	public String toString() {
		return String.format("Title: " + getGaTitle() + "\nFull name: " + getName() + "\nOffice: " + getOffice()
				+ "\nDate of Birth: " + getDateOfBirth() + "\nDate Sustained: " + getDateSustained()
				+ "\nFavorite Quote: \"" + getFavoriteQuote() + "\"\n");
	}

}
