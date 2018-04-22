package peoples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculationTest1 {

    @Test
    void calc_n() {
        assertEquals(39600, Calculation.Calc_n(33, 120000));
    }
}