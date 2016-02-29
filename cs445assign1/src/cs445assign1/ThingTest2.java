package cs445assign1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ThingTest2 {

	
	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errorContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outputContent));
	    System.setErr(new PrintStream(errorContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		String className = "testObj";
		Thing testThing = new Thing(className);
		
		Ant antTest = new Ant(className);
		//Give it to eat and test it if it ate anything
		antTest.eat(testThing);
	    assertEquals("testObj Ant has just eaten a testObj".trim(),outputContent.toString().trim());
		
	    System.setOut(new PrintStream(outputContent));
	    System.setErr(new PrintStream(errorContent));
	    
	    
	    
	}

}
