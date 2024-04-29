package edu.kirkwood.shared;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

import static edu.kirkwood.shared.UIUtility.displayWarning;

public class UserInput {

    public static double getDouble(String prompt, Scanner scanner) {
        return getDouble(prompt, scanner, -Double.MAX_VALUE, Double.MAX_VALUE);
    }

    public static double getDouble(String prompt, Scanner scanner, int min) {
        return getDouble(prompt, scanner, min, Double.MAX_VALUE);
    }

    public static double getDouble(String prompt, Scanner scanner, double min, double max) {
        double value = 0;

        String minMax = "";
        // if min is set and max is not set
        if(min != -Double.MAX_VALUE && max == Double.MAX_VALUE) {
            minMax = String.format(" [minimum %.1f]", min);
        }
        // if min and max are both set
        if(min != -Double.MAX_VALUE && max != Double.MAX_VALUE) {
            minMax = String.format(" [between %.1f and %.1f]", min, max);
        }

        while(true) {
            System.out.print(prompt + minMax + ": ");
            String valueStr = scanner.nextLine();
            try {
                value = Double.parseDouble(valueStr);
                if(value < min) {
                    displayWarning("Value entered is too low");
                } else if(value > max) {
                    displayWarning("Value entered is too high");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                displayWarning("Invalid integer");
            }
        }
        return value;
    }
    
    public static int getInt(String prompt, Scanner scanner) {
        return getInt(prompt, scanner, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public static int getInt(String prompt, Scanner scanner, int min) {
        return getInt(prompt, scanner, min, Integer.MAX_VALUE);
    }

    public static int getInt(String prompt, Scanner scanner, int min, int max) {
        int value = 0;

        String minMax = "";
        // if min is set and max is not set
        if(min != Integer.MIN_VALUE && max == Integer.MAX_VALUE) {
            minMax = String.format(" [minimum %d]", min);
        }
        // if min and max are both set
        if(min != Integer.MIN_VALUE && max != Integer.MAX_VALUE) {
            minMax = String.format(" [between %d and %d]", min, max);
        }

        while(true) {
            System.out.print(prompt + minMax + ": ");
            String valueStr = scanner.nextLine();
            try {
                value = Integer.parseInt(valueStr);
                if(value < min) {
                    displayWarning("Value entered is too low");
                } else if(value > max) {
                    displayWarning("Value entered is too high");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                displayWarning("Invalid integer");
            }
        }
        return value;
    }

    public static String getString(String prompt, Scanner scanner) {
        return getString(prompt, scanner, false);
    }

    public static String getString(String prompt, Scanner scanner, boolean required) {
        String value = "";
        while(true) {
            System.out.print(prompt + (required ? " (*)" : "") + ": ");
            value = scanner.nextLine().trim();
            if(required && !Helpers.isValidString(value)) {
                displayWarning("Input required");
            } else {
                break;
            }
        }
        return value;
    }

    public static boolean getBoolean(String prompt, Scanner scanner) {
        boolean value = true;
        while(true) {
            String valueStr = getString(prompt + " [y/n]", scanner);
            if(!(valueStr.equalsIgnoreCase("y") ||
                    valueStr.equalsIgnoreCase("n") ||
                    valueStr.equalsIgnoreCase("yes") ||
                    valueStr.equalsIgnoreCase("no"))
            ) {
                displayWarning("Invalid input");
            } else {
                value = valueStr.equalsIgnoreCase("y") || valueStr.equalsIgnoreCase("yes");
                break;
            }
        }
        return value;
    }

    public static LocalDate getDate(String prompt, Scanner scanner) {
        LocalDate date = null;
        while(true) {
            String dateStr = getString(prompt + " [MM/DD/YYYY]", scanner);
            if(!Helpers.isValidDate(dateStr)) {
                displayWarning("Invalid date");
            } else {
                try {
                    date = LocalDate.parse(dateStr, Validators.dateFormatInput);
                    break;
                } catch(DateTimeParseException e) {
                    displayWarning("Invalid date");
                }
            }
        }
        return date;
    }
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getDouble("Temperature", scanner);
        getDouble("User id", scanner, 1);
        getDouble("Number people", scanner, 0, 4);
        int deposit = getInt("Deposit amount", scanner);
        System.out.println(Helpers.toCurrency(deposit));
        getInt("Temperature", scanner);
        getInt("User id", scanner, 1);
        getInt("Number people", scanner, 0, 4);
        getString("First name", scanner, true);
        getString("Favorite movie", scanner);
        System.out.println(getBoolean("Handicap accessible", scanner));
        LocalDate checkInDate = getDate("Check in date", scanner);
        System.out.println(Helpers.printDate(checkInDate));
    }
}
