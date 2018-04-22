package peoples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest1 {

    @Test
    void calc_n() {
        assertEquals(4320, Calculation.Calc_n(18, 24000));
    }
}