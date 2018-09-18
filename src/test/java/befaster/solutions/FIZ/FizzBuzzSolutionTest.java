package befaster.solutions.FIZ;

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
		assertTrue(result.equals("fizz fake deluxe"));
	}
	
	
	@Test
	public void functionTestFizzDeluxe(){
		String result = classToBeTested.fizzBuzz(36);
		assertTrue(result.equals("fizz deluxe"));
	}
	

	@Test
	public void functionTestFizz2(){
		String result = classToBeTested.fizzBuzz(23);
		assertTrue(result.equals("fizz"));
	}
	
	
	
	
	@Test
	public void functionTestBuzz(){
		String result = classToBeTested.fizzBuzz(5);
		assertTrue(result.equals("buzz fake deluxe"));
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
		assertTrue(result.equals("fizz buzz fake deluxe"));
	}
	
	
	@Test
	public void functionTestFizzBuzz2(){
		String result = classToBeTested.fizzBuzz(51);
		assertTrue(result.equals("fizz buzz"));
	}
	

	@Test
	public void functionTestDeluxe(){
		String result = classToBeTested.fizzBuzz(44);
		assertTrue(result.equals("44"));
	}

	@Test
	public void functionTestFakeDeluxe(){
		String result = classToBeTested.fizzBuzz(77);
		assertTrue(result.equals("fake deluxe"));
	}
	

	
	@Test
	public void functionTestFizzFakeDeluxe(){
		String result = classToBeTested.fizzBuzz(237);
		assertTrue(result.equals("fizz fake deluxe"));
		String result2 = classToBeTested.fizzBuzz(3);
		assertTrue(result2.equals("fizz fake deluxe"));
		String result3 = classToBeTested.fizzBuzz(33);
		assertTrue(result3.equals("fizz fake deluxe"));
	}
	
	
	@Test
	public void functionTestFizzBuzzDeluxe2(){
		String result = classToBeTested.fizzBuzz(3510);
		assertTrue(result.equals("fizz buzz deluxe"));
	}
	
	

}
