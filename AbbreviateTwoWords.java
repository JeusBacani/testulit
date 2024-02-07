package utilities;

/**
 * Provides utility methods for abbreviating names.
 */
public final class AbbreviateTwoWords {

    // Make the constructor private to prevent instantiation of the class
    private AbbreviateTwoWords() {}

    /**
     * Abbreviates a name to its initials.
     * 
     * @param name the full name to abbreviate
     * @return the abbreviated form of the name
     * @throws IllegalArgumentException if the name does not contain at least two words
     */
    public static String abbrevName(final String name) {
        // Make the parameter final
        final String formattedName = name.toUpperCase().trim(); // Trim any leading or trailing spaces
        
        final String[] names = formattedName.split(" ");
        // Check if the array has at least two elements
        if (names.length >= 2) {
            // Add whitespace around the concatenation operator for readability
            return names[0].charAt(0) + ". " + names[1].charAt(0);
        } else {
            // Handle the case where the name doesn't contain two words
            throw new IllegalArgumentException("Name must contain at least two words.");
        }
    }
}
