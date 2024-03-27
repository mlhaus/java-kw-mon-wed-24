package edu.kirkwood.shared;

import java.time.format.DateTimeFormatter;

public class Validators {
    public static String dateRegex = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2\\d|3[01])/(19\\d\\d|20\\d\\d)$|^02/29/((19|20)(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96))$|^(0[13578]|1[02])/(0[1-9]|1\\d|2[0-8])/(19\\d\\d|20\\d\\d)$|^(0[13456789]|1[012])/(0[1-9]|1\\d|2[0-9]|3[01])/(19\\d\\d|20\\d\\d)$";
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            
}
