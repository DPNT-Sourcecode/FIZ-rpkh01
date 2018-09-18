package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloSolutionTest {
	
	
	private HelloSolution classToBeTested;
	
	@Before
	public void setup() {
		classToBeTested = new HelloSolution();
	}
	
	@Test
	public void helloTest() {
		String result = classToBeTested.hello("justAName");
		assertThat(result,equalTo("Hello, justAName!") );
	}
	
	@Test
	public void helloTestNullValue() {
		String result = classToBeTested.hello(null);
		assertThat(result,equalTo("Hello, World!") );
	}

}
