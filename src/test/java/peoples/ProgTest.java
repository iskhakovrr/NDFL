package peoples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProgTest {

    @Test
    void calc_n() {
        assertEquals( 1300, new Prog().Calc_n(13, 10000));
    }
}