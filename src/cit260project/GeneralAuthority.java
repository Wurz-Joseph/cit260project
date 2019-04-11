package cit260project;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * The General Authority model in our program.
 * 
 * @author
 */
/**
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
     * @param name        (Cannot be null)
     * 
     * @param dateOfBrith (Cannot be null)
     * 
     * @throws IllegalArgumentException if any of the parameters is null.
     */
    public GeneralAuthority(String name, String office, String gaTitle, String dateOfBirth, String dateSustained,
            String favoriteQuote) {

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.office = office;
        this.gaTitle = gaTitle;
        this.dateSustained = dateSustained;
        this.favoriteQuote = favoriteQuote;
        // Enforce the "not null" part of our contract.
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }

        // if (dateOfBirth == null) {
        // throw new IllegalArgumentException("dateOfBrith cannot be null");
        // }

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
        return String.format("Title: " + getGaTitle() + "\nFull name: " + getName() + "\nOffice: " + getOffice() + "\nDate of Birth: "
                + getDateOfBirth() + "\nDate Sustained: " + getDateSustained() + "\nFavorite Quote: \""
                + getFavoriteQuote() + "\"\n");
    }

}
