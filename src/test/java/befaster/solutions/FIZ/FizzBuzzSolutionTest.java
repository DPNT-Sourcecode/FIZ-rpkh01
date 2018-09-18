package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzSolutionTest {
	
	private FizzBuzzSolution classToBeTested;
	
	@Before
	public void setup() {
		classToBeTested = new FizzBuzzSolution();
	}
	
	
	@Test
	public void functionTestFizz(){
		assertThat(classToBeTested.fizzBuzz(3),equals("fizz"));
	}
}
