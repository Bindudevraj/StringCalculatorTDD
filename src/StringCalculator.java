
public class StringCalculator {
	public int Add(String numbers) {
		String[] input = numbers.split(",");
		if(numbers == "" ) {
			return 0;
		}
		else if(numbers.length() <= 2) {
			int a = Integer.parseInt(numbers);
			return a;
		}
		else {
			int a = Integer.parseInt(input[0])+ Integer.parseInt(input[1]);
			return a;
		}
//		return -1;
	}
//	private boolean isEmpty(String numbers) {
//		  return numbers.isEmpty();
//	  }
//    
//    private int stringToIntTransform(String numbers) {
//		  return Integer.parseInt(numbers);
//    }
}
