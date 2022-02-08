import java.util.ArrayList;

public class StringCalculator {
	public int Add(String numbers) {
		if(isEmpty(numbers)) {
			return 0;
		}
		if(numbers.startsWith("//")) {
			return delimiter(numbers);
		}
		else if(numbers.contains("\n")){
			numbers = numbers.replaceAll("\n", ",");
		}
		if(!numbers.contains(",")) {
			return stringToIntTransform(numbers);
		}
		else if(numbers.contains(",")){
			return AddSum(numbers);
		}
		else if(numbers.contains("-")) {
			throwExceptionIfNegativeExists(numbers);
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
		for(String current:input) {
			if(stringToIntTransform(current) <= 1000) {
				sum = sum + stringToIntTransform(current);
			}
		}
		return sum;
    }
	
	private int delimiter(String numbers) {
		String separator ="\n";
		int indexnum = numbers.indexOf(separator);
		numbers = numbers.replaceAll(";", ",");
		numbers = numbers.substring(indexnum + separator.length());
		return AddSum(numbers);
	}
	
	public static class NegativesNotAllowed extends RuntimeException {
		public NegativesNotAllowed(String numbers) {
	    super(numbers);
	    }
	}

	public static void throwExceptionIfNegativeExists(String numbers) {
	     if (numbers != "") {
	    		 throw new NegativesNotAllowed("negatives not allowed: "+ numbers);
	    	 }else {
	    		 String[] input = numbers.split(",");
		 		 int size = input.length;
		 		 for(int i=0; i < size; i++){
		 				throw new NegativesNotAllowed("Multiple negatives not allowed: "+ input[i]);
		 		  }
		 	   }
	      }
     }



