package edu.wctc;

import java.time.DateTimeException;
import java.time.LocalDate;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    //TODO add exceptions
    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws InvalidBirthdayException, UnknownGenderCodeException{



        try {
            LocalDate bDay = LocalDate.of(year, month, day);
        }catch (Exception e){
            throw new InvalidBirthdayException(year, month, day);
        }
        int mDG =0;

        if(genderCode == 'F'){
            mDG = (month-1)*40+day+MOD_FEMALE;
        }else if(genderCode == 'M'){
            mDG = (month-1)*40+day+MOD_MALE;
        }else{
            throw new UnknownGenderCodeException(genderCode);
        }
        return mDG;
    }
}
