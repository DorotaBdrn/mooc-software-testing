package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BoundaryTestMy {

    @ParameterizedTest(name = "small{0}, big = {1}, total={2}, result = {3}")
    @CsvSource({"1,1,5,0", "1,1,6,1", "1,1,7,-1", "1,1,6,1"})

    public void totalIsToBig(int small, int big,int total, int expected){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest(name = "small{0}, big = {1}, total={2}, result = {3}")
    @CsvSource({"4,0,10,-1","4,1,10, -1", "5,2,10,0", "5,3,10,0"})
    public void onlyBigBars(int small, int big , int total, int expected){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest(name = "small{0}, big = {1}, total={2}, result = {3}")
    @CsvSource({"0,3,17,-1", "1,3,17,-1", "2,3,17,2", "3,3,17,2","0,3,12,-1", "1,3,12,-1", "2,3,12,2", "3,3,12,2"})
    public void BigAndSmallBArs(int small, int big , int total, int expected){
        ChocolateBags bags = new ChocolateBags();
        int result  = bags.calculate(small, big, total);
        Assertions.assertEquals(expected, result);

    }



}
