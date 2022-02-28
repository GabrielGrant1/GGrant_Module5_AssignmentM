package edu.wctc;

import java.util.Formatter;

public class FloridaFormatter implements DriversLicenseFormatter {

    public String formatLicenseNumber(DriversLicense driversLicense){

        String S = driversLicense.getSSSS();
        int F = driversLicense.getFFF();
        int Y = driversLicense.getYY();
        String year = Integer.toString(Y);
        String y = year.substring(2);
        int D = driversLicense.getDDD();
        int N = driversLicense.getNN();


        return String.format("Florida: %s-%d-%s-%3d-%d", S, F, y, D, N);
    }
}
