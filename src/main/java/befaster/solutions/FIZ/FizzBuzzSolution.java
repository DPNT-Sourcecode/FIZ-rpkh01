package befaster.solutions.FIZ;

import java.util.HashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	StringBuilder builder = new StringBuilder();
    	String result;
    	if (number % 3 == 0 || number.toString().contains("3")) {
    		builder.append("fizz ");
    	}
    	if (number % 5 == 0 || number.toString().contains("5")) {
    		builder.append("buzz ");    		
    	}
    	if (number > 10 && checkDeluxe(number)) {
    		builder.append("buzz");    		
    	}
    	if(builder.length() == 0) {
    		result = number.toString();
    	}else {
    		result = builder.toString().trim();
    	}
    	return result;
    }
    
    private Boolean checkDeluxe(Integer number) {
    	
    	Map<CharSequence,Integer> map = new HashMap<>();
    	for parameter.in
//    	chars().forEach( map.put(i, 1));
    }

}
