package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	StringBuilder builder = new StringBuilder();
    	String result;
    	if (number % 3 == 0 || number.toString().contains("3")) {
    		builder.append("fizz ");
    	}
    	if (number % 5 == 0 || number.toString().contains("5")) {
    		builder.append("buzz");    		
    	}
    	if(builder.length() == 0) {
    		result = number.toString();
    	}else {
    		result = builder.toString().trim();
    	}
    	return result;
    }

}
