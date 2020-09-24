package tudelft.gettingstarted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class gettingStartedNewTest {

    @Test
    public void addFiveToFiveTest() {
        int result = new GettingStarted().addFive(5);
        Assertions.assertEquals(10, result);

    }

    @Test
    public void addOneToFiveTest() {
        int result = new GettingStarted().addFive(1);
        Assertions.assertEquals(6, result);
    }
}
