package edu.wctc;

import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {
    private Soundex soundex = new Soundex();


    //TODO throw exception
    public String encodeLastName(String lastName) throws MissingNameException{
        if(lastName.equals("")){
            throw new MissingNameException("Last Name");
        }
        String lN = soundex.encode(lastName);
        return lN;
    }
}
