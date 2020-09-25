package tudelft.roman;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MyRomanNumeralTest {

    @Test
    public void numeralWithSingleNum(){
        MyRomanNumeral roman = new MyRomanNumeral();
        int result  = roman.convert("I");
        Assertions.assertEquals(1,result);

    }

    @Test
    public void numeralWithManyDigits(){
        MyRomanNumeral roman2 = new MyRomanNumeral();
        int result2 = roman2.convert("VII");
        Assertions.assertEquals(7,result2);
    }








}
