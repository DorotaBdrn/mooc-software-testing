package tudelft.gettingstarted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class gettingStartedNewTest {

    @Test
    public void addFiveToFiveTest(){
        int result = new GettingStarted().addFive(5);
        Assertions.assertEquals(10,result);

    }
}
