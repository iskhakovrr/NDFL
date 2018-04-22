package peoples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest2{

    @Test
    void calc_n() {
        assertEquals(1500, Calculation.Calc_n(15, 10000));
    }
}