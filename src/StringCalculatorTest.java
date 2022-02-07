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
	public void returnsNumberForSingleNumber() {
		assertEquals(calc.Add("1"), 1);
	}
	
	@Test
	public void returnsNumberForMultipleDigitNumber() {
		assertEquals(calc.Add("19"), 19);
	}
	
	@Test
	public void returnsSumForTwoNumbers() {
		assertEquals(calc.Add("1,2"), 3);
	}
	
	@Test
	public void returnsSumForMultipleNumbers() {
		assertEquals(calc.Add("1,2,3,8"), 14);
	}
	
	@Test
	public void returnsValidSumForNewLineDelimiter() {
		assertEquals(calc.Add("1\n2,3"), 6);
	}
	
	@Test
	public void returnsValidSumForDifferentDelimiter() {
              //		“//[delimiter]\n[numbers…]”
		assertEquals(calc.Add("//;\n1;2"), 3);
	}
}
