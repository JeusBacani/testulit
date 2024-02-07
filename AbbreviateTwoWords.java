package utilities;


public final class AbbreviateTwoWords {

    
    private AbbreviateTwoWords() {}

    /**
     * Abbreviates a name to its initials.
     * 
     * @param name the full name to abbreviate
     * @return the abbreviated form of the name
     * @throws IllegalArgumentException if the name does not contain at least two words
     */
    public static String abbrevName(final String name) {
       
        final String formattedName = name.toUpperCase().trim();
        
        final String[] names = formattedName.split(" ");

        if (names.length >= 2) {
            
            return names[0].charAt(0) + ". " + names[1].charAt(0);
        } else {
          
            throw new IllegalArgumentException("Name must contain at least two words.");
        }
    }
}
