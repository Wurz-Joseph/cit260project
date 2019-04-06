package cit260project;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The General Authority model in our program.
 * 
 * @author
 */
public class GeneralAuthority {

    private String office;
    private String name;
    private Calendar dateOfBirth;
    private String title;
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
    public GeneralAuthority(String name, Calendar dateOfBirth, String office, String title, String dateSustained,
            String favoriteQuote) {
        // Enforce the "not null" part of our contract.
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }

        if (dateOfBirth == null) {
            throw new IllegalArgumentException("dateOfBrith cannot be null");
        }

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.office = office;
        this.title = title;
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
    public Calendar getDateOfBirth() {
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
     * 
     * @return title (President, Elder)
     */
    public String getTitle() {
        return title;
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
    public String getFavoritedQuote() {
        return favoriteQuote;
    }

}
