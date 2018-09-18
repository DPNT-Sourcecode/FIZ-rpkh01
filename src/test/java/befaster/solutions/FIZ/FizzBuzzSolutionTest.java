package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

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
		String result = classToBeTested.fizzBuzz(3);
		assertTrue(result.equals("fizz"));
	}
	

	@Test
	public void functionTestFizz2(){
		String result = classToBeTested.fizzBuzz(23);
		assertTrue(result.equals("fizz"));
	}
	
	
	@Test
	public void functionTestBuzz(){
		String result = classToBeTested.fizzBuzz(5);
		assertTrue(result.equals("buzz"));
	}
	@Test
	public void functionTestBuzz2(){
		String result = classToBeTested.fizzBuzz(52);
		assertTrue(result.equals("buzz"));
	}
	

	
	
	@Test
	public void functionTestNumber(){
		String result = classToBeTested.fizzBuzz(7);
		assertTrue(result.equals("7"));
	}

	
	
	@Test
	public void functionTestFizzBuzz(){
		String result = classToBeTested.fizzBuzz(15);
		assertTrue(result.equals("fizz buzz"));
	}
	
	
	@Test
	public void functionTestFizzBuzz2(){
		String result = classToBeTested.fizzBuzz(51);
		assertTrue(result.equals("fizz buzz"));
	}
	

	@Test
	public void functionTestDeluxe(){
		String result = classToBeTested.fizzBuzz(44);
		assertTrue(result.equals("deluxe"));
	}
	

	@Test
	public void functionTestDeluxeMinor10(){
		String result = classToBeTested.fizzBuzz(8);
		assertTrue(result.equals("8"));
	}
}
