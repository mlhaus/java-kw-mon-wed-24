package edu.kirkwood.demo_2;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String school = "Kirkwood"; // always use double quotes
        char firstLetter = 'K'; // char use single quotes
        char secondLetter = school.charAt(1); // 'i'
        System.out.println(secondLetter);
        int difference = school.compareTo("Eagles"); // 75 - 69 = 6
        // Positive numbers returned means the strings are not in alphabetical order
        System.out.println(difference);
        difference = "Eagles".compareTo(school); // 69 -75 = -6
        // Negative numbers or 0 returned means the strings are in alphabetical order
        System.out.println(difference);
        difference = school.compareTo("eagles"); // 75 - 101 = -26
        System.out.println(difference);
        difference = school.compareToIgnoreCase("eagles"); // 75 - 69 = 6
        System.out.println(difference);
        String team = school + " Eagles"; // "Kirkwood Eagles"
        System.out.println(team);
        team = school.concat(" Eagles");
        System.out.println(team);
        boolean containsEagles = school.contains("Eagles"); // false
        System.out.println(containsEagles);
        containsEagles = team.contains("Eagles"); // true
        System.out.println(containsEagles);
        boolean isEagles = school.equals("Eagles"); // false
        System.out.println(isEagles);
        boolean isKirkwood = school.equals("Kirkwood"); // true
        System.out.println(isKirkwood);
        isKirkwood = school.equals("kirkwood"); // false
        System.out.println(isKirkwood);
        isKirkwood = school.equalsIgnoreCase("kirkwood"); // true
        System.out.println(isKirkwood);
        isKirkwood = school.equals(100); // false
//        isKirkwood = school.equalsIgnoreCase(100);
        String result = String.format("%s %s!", "Let's Go", team); // Let's Go Kirkwood Eagles!
        System.out.println(result);
        int index = school.indexOf("wood"); // 4
        System.out.println(index);
        index = school.indexOf("Eagles"); // -1
        int numChars = school.length(); // 8
        System.out.println(numChars);
        numChars = "Eagles".length(); // 6
        System.out.println(numChars);
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        boolean isValidEmail = school.matches(regexEmail); // false
        System.out.println(isValidEmail);
        String email = "sammy-the-eagle@kirkwood.edu ";
        email = email.trim();
        isValidEmail = email.matches(regexEmail); // true
        System.out.println(isValidEmail);
        String email2 = email.replace("-", "_"); // "sammy_the_eagle@kirkwood.edu "
        System.out.println(email2);
        String[] emailParts = email.split("@");
        System.out.println(emailParts); // [Ljava.lang.String;@1dfb72a
        System.out.println(Arrays.toString(emailParts));
        String sammy = email.substring(0, email.indexOf("@")); // all characters between 0 and 15, "sammy-the-eagle"
        System.out.println(sammy);
        String domain = email.substring(email.indexOf("@") + 1); // all characters from 16 to end, "kirkwood.edu"
        System.out.println(domain);
        char[] letters = school.toCharArray();
        System.out.println(letters);
        System.out.println(Arrays.toString(letters));
        String schoolLow = school.toLowerCase(); // "kirkwood"
        System.out.println(schoolLow);
        String schoolUpper = school.toUpperCase(); // "KIRKWOOD"
        System.out.println(schoolUpper);
        int ranking = 1;
        String rankingStr = String.valueOf(ranking);
        System.out.println(rankingStr);
        System.out.println(rankingStr.getClass()); // java.lang.String
        rankingStr = ranking + "";
        System.out.println(rankingStr);
    }
}
