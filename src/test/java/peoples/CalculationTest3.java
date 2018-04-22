package peoples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest3 {

    @Test
    void calc_n() {
        assertEquals(11500, Calculation.Calc_n(23, 50000));
    }
}