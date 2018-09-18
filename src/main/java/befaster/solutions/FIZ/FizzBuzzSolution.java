package befaster.solutions.FIZ;

import java.util.HashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	StringBuilder builder = new StringBuilder();
    	Boolean deluxe = false;
    	String result;
    	
    	if (number % 3 == 0 || number.toString().contains("3")) {
    		builder.append("fizz ");
    	}
    	if (number % 5 == 0 || number.toString().contains("5")) {
    		builder.append("buzz ");    		
    	}
    	if (number % 3 == 0 && number.toString().contains("3")) {
    		builder.append("deluxe");    		
    	}
    	if (number % 5 == 0 && number.toString().contains("5")) {
    		builder.append("deluxe");  
    	}
    	if (number > 10 && checkDeluxe(number)) {
    		if (number % 2 != 0) {
    			builder.append("fake deluxe");
    		}   		
    	}
    	if(builder.length() == 0) {
    		result = number.toString();
    	}else {
    		result = builder.toString().trim();
    	}
    	return result;
    }
    
    private Boolean checkDeluxe(Integer number) {
    	char[] stringNumber  = number.toString().toCharArray();
    	Map<String,Integer> map = new HashMap<>();
    	for (int i=0; i < stringNumber.length ; i++) {
    		char letter = stringNumber[i];
    		map.put(letter + "", 1);
    	}
    	return map.size() == 1;
    }

}
