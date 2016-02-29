package cs445assign1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ThingTest3 {

	Thing thingObj = new Thing("thingObj"); 
	Ant antTest = new Ant("antObj");
	Bat batObj = new Bat("batObj");
	Tiger tigObject = new Tiger("tigObj");
	Fly flyObject = new Fly("flyObj");
	
	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errorContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreamsFeedAntBat() {
	    System.setOut(new PrintStream(outputContent));
	    System.setErr(new PrintStream(errorContent));
	    antTest.eat(thingObj);
	    batObj.eat(tigObject);
	    batObj.eat(antTest);
		antTest.whatDidYouEat();
		batObj.whatDidYouEat();
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	@Test
	public void test() {
		
		//Testing for the Ant object to respond to food
		//and to see if Bat responds to different food differently,(refusing to eat a thing food)
		//a fly should refuse non thing food
		//also to see if the bat maintains the last eaten food

	    assertEquals("antObj Ant has just eaten a thingObj\nantObj Ant has eaten a thingObj\nbatObj Bat has eaten a antObj Ant".trim(),outputContent.toString().trim());
		
	}

}
