
public class StringCalculator {
	public int Add(String numbers) {
		if(numbers == "" ) {
			return 0;
		}
		else if(numbers.length() >= 1) {
			int a = Integer.parseInt(numbers);
			return a;
		}
		return -1;
	}
}
