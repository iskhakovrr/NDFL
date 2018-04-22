package peoples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculationTest6 {

    @Test
    void calc_n() {
        assertEquals(1920, Calculation.Calc_n(12, 16000));
    }
}