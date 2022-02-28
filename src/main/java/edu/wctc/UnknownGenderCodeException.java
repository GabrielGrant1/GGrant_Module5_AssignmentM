package edu.wctc;

public class UnknownGenderCodeException extends Exception{
    public UnknownGenderCodeException(char genderCode){
        super(genderCode + " Does not match known gender codes.");
    }
}

