package edu.kirkwood.shared;

import java.text.DecimalFormat;

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
}
