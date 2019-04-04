package cit260project;


import java.util.Calendar;
import java.util.GregorianCalendar;




/**
 * The General Authority model in our program.
 * @author 
 */
public class GeneralAuthority {
    
    private String name;
    private Calendar dateOfBirth;
    private String office;
	private String title;
	private String dateSustained;
	private String favoriteQuote;
	

    
    /**
     * Constructor for a Person object.
     * @param name (Cannot be null)

     * @param dateOfBrith (Cannot be null)
     * 
     * @throws IllegalArgumentException if any of the parameters
     * is null.
     */
    public GeneralAuthority(String name, Calendar dateOfBirth, String office, String title, String dateSustained, String favoriteQuote) {
        // Enforce the "not null" part of our contract.
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("dateOfBrith cannot be null");
        }
        
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Provide the person's name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Provide the person's date of birth
     * @return the dateOfBirth
     */
    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     * 
     * @return office (Prophet, Apostle, Seventy)
     */
    public String getOffice(){
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
    
    
    /**
     * Calculate the person's age
     * @return
     */
    public int getAge() {
        // There are a lot of different (and complex) ways we can
        // calculate the age. Encapsulation lets us calculate it
        // any way we want. We're going to find the difference
        // between the years, and then check to see if the month
        // and day of their birthday has already passed for this
        // year.
        

        // The "contract" for GregorianCalendar indicates that the
        // empty constructor returns a calendar representing 
        // "right now."
        Calendar now = new GregorianCalendar();
        
        int age = now.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        
        
        int nowMonth = now.get(Calendar.MONTH);
        int nowDay = now.get(Calendar.DAY_OF_MONTH);
        
        int birthMonth = dateOfBirth.get(Calendar.MONTH);
        int birthDay = dateOfBirth.get(Calendar.DAY_OF_MONTH);
        
        // Check to see if they've already had their birthday this year.
        if (birthMonth > nowMonth
                || (birthMonth == nowMonth && birthDay > nowDay)) {
            age--;
        }
        
        return age;
        
    }
    
    
    
}
