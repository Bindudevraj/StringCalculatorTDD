public class StringCalculator {
	public int Add(String numbers) {
		if(isEmpty(numbers)) {
			return 0;
		}
		if(!numbers.contains(",")) {
			return stringToIntTransform(numbers);
		}
		else if(numbers.contains(",")){
			return AddSum(numbers);
		}
		return -1;
	}
	
	private boolean isEmpty(String numbers) {
		return numbers.isEmpty();
	}
	
	private int stringToIntTransform(String numbers) {
		return Integer.parseInt(numbers);
    }
	
	private int AddSum(String numbers) {
		String[] input = numbers.split(",");
		int size = input.length;
		int sum=0;
		for(int i=0; i<size; i++){
			sum = sum + Integer.parseInt(input[i]);
		}
		return sum;
    }
}