package Tests;
import org.junit.Assert;
import  org.junit.Test ;

import peoples.Prog;
public class TestCalculationClass {
@Test
public void testing(){
Prog P = new Prog();
float A=P.Calc_n(13, 10000);

if(A!=1300) {Assert.fail();
	System.out.println("Test failed!");}
else {
	System.out.println("Congratulations! Test successful!");}
}
}