package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter{
    public String formatLicenseNumber(DriversLicense driversLicense){

        String S = driversLicense.getSSSS();
        int F = driversLicense.getFFF();
        int Y = driversLicense.getYY();
        String year = Integer.toString(Y);
        String y1 = year.substring(2,3);
        String y2 = year.substring(3);
        int D = driversLicense.getDDD();
        int N = driversLicense.getNN();

//        Wisconsin: SSSS-FFFY-YDDD-NN
//        Florida: SSSS-FFF-YY-DDD-N
        return String.format("Wisconsin: %s-%d%s-%s%3d-%2d", S, F, y1, y2, D, N);
    }
}
