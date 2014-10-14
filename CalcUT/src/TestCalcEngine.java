// Justin Mercado
// PS4
import static org.junit.Assert.*;

import org.junit.Test;

import MainPackage.Calculate;


public class TestCalcEngine extends Calculate{

	@Test
	public void test() {
		Calculate test1= new Calculate(10000,3,3.25);
		Calculate test2= new Calculate(10000,10,9);
		
		
		assertEquals(test1.FutureValue(), 11007.03, .01);
		assertEquals(test2.FutureValue(), 23673.64, .01);
		assertEquals(test1.getAIR(), 3.25, .01);
		assertEquals(test2.getIA(), 10000, .01);
		assertEquals(test1.getYears(), 3, .01);
	}

}
