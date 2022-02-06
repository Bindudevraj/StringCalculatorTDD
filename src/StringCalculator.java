
public class StringCalculator {
	public int Add(String numbers) {
		String[] input = numbers.split(",");
		if(isEmpty(numbers)) {
			return 0;
		}
		if(numbers.length() == 1) {
			return stringToIntTransform(numbers);
		}
		else{
			  return Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
		}
	}
	private boolean isEmpty(String numbers) {
		  return numbers.isEmpty();
	  }
    
    private int stringToIntTransform(String numbers) {
		  return Integer.parseInt(numbers);
    }
}