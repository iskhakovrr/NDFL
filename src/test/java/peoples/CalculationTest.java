package peoples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
 Calculation testingClass;

    @BeforeEach
   void setUp() {
        testingClass = new Calculation();
    }

   @AfterEach
   void tearDown() {
        testingClass = null;
   }
   
    @Test
    void calc_n() {
        assertEquals(1300, Calculation.Calc_n(13, 10000));
    }
}