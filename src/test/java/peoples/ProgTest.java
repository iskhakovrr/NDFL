package peoples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProgTest {

    @Test
    void calc_n() {
        Prog testClass = new Prog();
        assertEquals( 1300, testClass.Calc_n(13, 10000));
    }
}