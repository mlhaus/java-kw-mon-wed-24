package edu.kirkwood.shared;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.regex.Pattern;

/**
 * These are methods to help with number and date tasks. They can be re-used in multiple projects
 */
public class Helpers {
    
    /**
     * Format a double value to a string with a specified number of decimal places
     * @param number The double value to be formatted
     * @param numDecPlaces The desired number of decimal places
     * @return A string representation of the formatted number.
     */
    public static String round(double number, int numDecPlaces) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#"); // Step 1: Instantiate a DecimalFormat object
        // Step 2: Set the DecimalFormat pattern - 0.# means something will always print to the left of the decimal
        decimalFormat.setMaximumFractionDigits(numDecPlaces); // Step 3: Call the non-static method to set the number of decimal places
        return decimalFormat.format(number); // Step 4: Format the decimal number as a string and return it.
    }

    public static String toCurrency(double amt) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(amt);
    }

    public static boolean isValidString(String str) {
        return str != null && !str.equals("");
    }

    public static boolean isNumeric(String str) {
        return str.matches("[0-9]+");
    }



    /**
     * To generate a random integer
     * @param min The smallest int to return
     * @param max The largest int to return
     * @return A random integer between min and max
     */
    public static int randint(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static String printDate(LocalDate date) {
        return Validators.dateFormatOutput.format(date);
    }
    
    public static boolean areDatesInOrder(LocalDate date1, LocalDate date2) {
        return date1.compareTo(date2) < 0;
    }

    /**
     * Is a date in the past, today, or in the future 
     * @param date a LocalDate object
     * @return true if a date is today or in the future, false if the date is in the past
     */
    public static boolean isTodayOrFuture(LocalDate date) {
        return !date.isBefore(LocalDate.now());
    }
    
    public static LocalDate addDays(LocalDate date, int numDays) {
        return date.plusDays(numDays);
    }
    
    public static boolean isValidDate(String dateStr) {
        return Pattern.matches(Validators.dateRegex, dateStr);
    }
    


}
