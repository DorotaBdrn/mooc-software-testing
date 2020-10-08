package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.cert.CertSelector;

public class CaesarShiftCipherTest {

    @Test
    public void CesarShifttestAbc(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String result = cs.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def",result);


    }

    @Test
    public void CaesarShiftTestXyz(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String reult = cs.CaesarShiftCipher("xyz",3);
        Assertions.assertEquals("abc",reult);
    }

    @Test
    public void CaesarShiftTestGkm() {
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String reult = cs.CaesarShiftCipher("gkm", 3);
        Assertions.assertEquals("jnp", reult);
    }
    @Test
    public void CaesarShiftTestWxy(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String reult = cs.CaesarShiftCipher("wxy",3);
        Assertions.assertEquals("zab",reult);
    }
    @Test
    public void CaesarShiftTestInvalid(){
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String reult = cs.CaesarShiftCipher("w.y",3);
        Assertions.assertEquals("invalid",reult);
    }

}
