package cs445assign1;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ThingTest {

	Fly flyObject = new Fly("flyObj");
	Bat batObj = new Bat("batObj");
	
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
		String className = "thingObj";
		Thing thingObj = new Thing(className);
		//Testing if the name passed is what is returned by toString method() because this is a Thing object
		assertEquals(className,thingObj.toString());
		
		
		Ant antTest = new Ant(className);
		//Testing if the name passed + classname is what is returned by toString method() because this is a non Thing object
		assertEquals(className + " " + antTest.getClass().getSimpleName(),antTest.toString());
		
	    batObj.eat(thingObj);
	    flyObject.eat(antTest);
		
		
		//Testing if the ant ate anything it should be blank
		antTest.whatDidYouEat();
		assertEquals("batObj Bat won't eat a thingObj.\nflyObj Fly won't eat a thingObj Ant\nthingObj Ant has had nothing to eat!".trim(),outputContent.toString().trim());
		
		//System.setOut(null);
	    //System.setErr(null);
	    
	}

}









