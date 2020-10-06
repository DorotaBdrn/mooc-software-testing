package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTestMy {

    @Test
    public void leapYearThatAreNonCenturialYears(){
        LeapYear ly = new LeapYear();
        boolean result = ly.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void LeapCenturialYears(){
        LeapYear ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturioaYear(){
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }

    @Test
    public void nonLeapYwar(){
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(2023));
    }


}
