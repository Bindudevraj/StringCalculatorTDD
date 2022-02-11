import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public int Add(String numbers) {
		if(isEmpty(numbers)) {
			return 0;
		}
		if(numbers.startsWith("//")) {
			if(numbers.contains("[")) {
				return nDelimiter(numbers);
			}
			else if(numbers.matches("[.*]") && 
					numbers.matches("[.*]")) 
			{
				return multipleDelimiter(numbers);
			}
		    return singleDelimiter(numbers);
		}
		else if(numbers.contains("\n")){
			numbers = numbers.replaceAll("\n", ",");
		}
		if(!numbers.contains(",")) {
			return stringToIntTransform(numbers);
		}
		else if(numbers.contains(",")){
			return addSum(numbers);
		}
		else if(numbers.contains("-")) {
			throwExceptionIfNegativeExists(numbers);
		}
		return -1;
	}
	
	private boolean isEmpty(String numbers) {
		return numbers.isEmpty();
	}
	
	private static int stringToIntTransform(String numbers) {
		return Integer.parseInt(numbers);
    }
	
	private static int addSum(String numbers) {
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
	
	public int singleDelimiter(String numbers) {
		String separator ="\n";
		int indexnum = numbers.indexOf(separator);
		numbers = numbers.replaceAll(";", ",");
		numbers = numbers.substring(indexnum + separator.length());
		return addSum(numbers);
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
	
	public static int nDelimiter(String numbers) {
		numbers = numbers.substring(numbers.indexOf("[") + 1);
		String delimiter = numbers.substring(0, numbers.indexOf("]"));
		String separator ="\n";
		int indexnum = numbers.indexOf(separator);
		numbers = numbers.substring(indexnum + separator.length());
		numbers = numbers.replaceAll("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]+", ",").replaceAll("\\s+", ",");
		return addSum(numbers);
	}
	
	public static int multipleDelimiter(String numbers) {
		numbers = numbers.replaceAll("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]+", ",");
		return addSum(numbers);
	}
}



