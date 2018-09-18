package befaster.solutions.HLO;

import com.google.common.base.Preconditions;

public class HelloSolution {
	
	
	
    private static final String HELLO2 = "Hello, ";

    
	public String hello(String friendName) {
		Preconditions.checkNotNull(friendName);
        return HELLO2.concat(friendName).concat("!"); 
    }
}
