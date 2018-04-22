package peoples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest7 {

    @Test
    void calc_n() {
        assertEquals(3825, Calculation.Calc_n(17, 22500));
    }
}