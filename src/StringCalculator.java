public class StringCalculator {
	public int Add(String numbers) {
		if(isEmpty(numbers)) {
			return 0;
		}
		if(!numbers.contains(",")) {
			return stringToIntTransform(numbers);
		}
		else if(numbers.contains(",")){
			String[] input = numbers.split(",");
			return Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
		}
		return -1;
	}
	
	private boolean isEmpty(String numbers) {
		  return numbers.isEmpty();
	}
	
	private int stringToIntTransform(String numbers) {
		  return Integer.parseInt(numbers);
    }
}


//	private static int SumofNumbers(String[] input, int size){
//		for(int i =0 ; i <size; i++) {
//			int sum = 0;
//			sum = sum + toInt(input[i]);
//			}
//		return sum;
//	    }

//private int SumOfTwoNumbers(String numA, String numB) {
//	return Integer.parseInt(numA) + Integer.parseInt(numB);
//}