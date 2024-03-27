package edu.kirkwood.shared;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInput {

    public static int getInt(String prompt, Scanner scanner) {
        int value = 0;
        while(true) {
            System.out.print(prompt + ": ");
            String valueStr = scanner.nextLine();
            try {
                value = Integer.parseInt(valueStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("** Invalid integer **");
            }
        }
        return value;
    }

    public static String getString(String prompt, Scanner scanner) {
        System.out.print(prompt + ": ");
        String value = scanner.nextLine().trim();
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
                System.out.println("** Invalid input **");
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
            if(!Pattern.matches(Validators.dateRegex, dateStr)) {
                System.out.println("** Invalid date **");
            } else {
                date = LocalDate.parse(dateStr, Validators.dateFormatter);
                break;
            }
        }
        return date;
    }
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getInt("User id", scanner);
        getString("First name", scanner);
        System.out.println(getBoolean("Handicap accessible", scanner));
        System.out.println(getDate("Check in date", scanner));
    }
}
