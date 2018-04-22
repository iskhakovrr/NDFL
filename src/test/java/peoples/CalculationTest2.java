package peoples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CalculationTest2{
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
        assertEquals(1500, Calculation.Calc_n(15, 10000));
    }
}