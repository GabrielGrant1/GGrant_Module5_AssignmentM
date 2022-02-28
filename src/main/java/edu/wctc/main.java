package edu.wctc;

import java.io.IOException;
import java.text.Normalizer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InvalidBirthdayException {
        String firstName, lastName, middleInitial;
        char genderCode;
        LocalDate birthdate;

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("What is your first name?");
        firstName = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("What is your middle initial?");
        //Help from https://www.javatpoint.com/Scanner-class
        middleInitial = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("What is your last name?");
        lastName = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("What is your gender? (M/F)");
        String g = scanner.nextLine().toUpperCase(Locale.ROOT);
        genderCode = g.charAt(0);
        System.out.println("What is your birthday? (DD)");
        int day = scanner.nextInt();
        System.out.println("What is your birth month? (MM)");
        int month = scanner.nextInt();
        System.out.println("What is your birth year? (YYYY)");
        int year = scanner.nextInt();


        try{
            DriversLicense driversLicense = new DriversLicense();
            LastNameUtility lastNameUtility = new LastNameUtility();
            FirstNameUtility firstNameUtility = new FirstNameUtility();
            MonthDayGenderUtility monthDayGenderUtility = new MonthDayGenderUtility();
            String SSSS = lastNameUtility.encodeLastName(lastName);
            int FFF = firstNameUtility.encodeFirstName(firstName, middleInitial);
            int YY = year;
            int DDD = monthDayGenderUtility.encodeMonthDayGender(year, month, day, genderCode);
            driversLicense.setSSSS(SSSS);
            driversLicense.setFFF(FFF);
            driversLicense.setYY(YY);
            driversLicense.setDDD(DDD);
            driversLicense.setNN(00);
            FloridaFormatter floridaFormatter = new FloridaFormatter();
            WisconsinFormatter wisconsinFormatter = new WisconsinFormatter();
            System.out.println(floridaFormatter.formatLicenseNumber(driversLicense));
            System.out.println(wisconsinFormatter.formatLicenseNumber(driversLicense));
        }catch (UnknownGenderCodeException | InvalidBirthdayException | MissingNameException e) {
            System.out.println(e.getMessage());
            System.out.println("Exiting Program.");
        }
    }
}
