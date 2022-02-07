public class StringCalculator {
	public int Add(String numbers) {
		if(numbers == "" ) {
			return 0;
		}
		if(!numbers.contains(",")) {
			int a = Integer.parseInt(numbers);
			return a;
		}
		else if(numbers.contains(",")){
			String[] input = numbers.split(",");
			int sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
			return sum;
		}
		return -1;
	}
}
//		else if(numbers != searchvalue ) {
//			int a = Integer.parseInt(numbers);
//			return a;
//		}
//		else {
////			if(numbers == searchvalue){
//				String[] input = numbers.split(",");
//				int sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
//				return sum;
////			}
//		}
//	}
//}
//	private static int SumofNumbers(String[] input, int size){
//		for(int i =0 ; i <size; i++) {
//			int sum = 0;
//			sum = sum + toInt(input[i]);
//			}
//		return sum;
//	    }
//	
//	private boolean isEmpty(String numbers) {
//		  return numbers.isEmpty();
//	  }
//    
//    
//	private int stringToIntTransform(String numbers) {
//		  return Integer.parseInt(numbers);
//    }
//    
//	private int SumOfTwoNumbers(String numA, String numB) {
//    	return Integer.parseInt(numA) + Integer.parseInt(numB);
//    }