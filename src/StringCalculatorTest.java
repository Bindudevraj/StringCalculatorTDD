import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;


public class StringCalculatorTest {
	private StringCalculator calc;

	@Before
	public void init() {
		calc = new StringCalculator();
	}

	@Test 
	public void returnsZeroForEmptyString() {
		assertEquals(calc.Add(""), 0);
	}
	
	@Test
	public void returnNumberForSingleNumber() {
		assertEquals(calc.Add("1"), 1);
	}
	
	@Test
	public void returnNumberForMultipleDigitNumber() {
		assertEquals(calc.Add("19"), 19);
	}
	
	@Test
	public void returnSumForTwoNumbers() {
		assertEquals(calc.Add("1,2"), 3);
	}
	
//	@Test
//	public void returnSumForMultipleNumbers() {
//		assertEquals(calc.SumofNumbers("1,2,3,4"), 10);
//	}
	
}
