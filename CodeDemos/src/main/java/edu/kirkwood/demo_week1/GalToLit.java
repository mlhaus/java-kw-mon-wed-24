package edu.kirkwood.demo_week1;

import static edu.kirkwood.shared.Helpers.round;

public class GalToLit {

    private static final double LITERS_PER_GALLON = 3.78541;

    public static void main(String[] args) {
        double gallons;
        double liters;
        for (gallons = 0.5; gallons <= 20; gallons += 0.5) {
            liters = gallons * LITERS_PER_GALLON;
            String gallonsStr = "gallons";
            if (gallons == 1) {
                gallonsStr = "gallon";
            }
//            System.out.printf("%.2f %s is %.4f liters\n", gallons, gallonsStr, liters);
            System.out.printf("%s %s is %s liters\n", round(gallons, 1), 
                    gallonsStr, round(liters, 4));
        }
    }
}
