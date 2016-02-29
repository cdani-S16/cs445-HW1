package cs445assign1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPolymorphism {

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
		Ant antObj = new Ant("antobj");
		Tiger tigerObj = new Tiger("tigerobj");
		Bat batObj = new Bat("batobj");
		Fly flyObj = new Fly("flyobj");
		
		antObj.move();
		tigerObj.move();
		batObj.move();
		flyObj.move();
		
		//Testing for polymorphism, calling all the objects the same method, but looking fr different responses
		assertEquals("antobj Ant is crawling around.\ntigerobj Tiger has just pounced.\nbatobj Bat is swooping through the dark.\nflyobj Fly is buzzing around in flight.".trim(),outputContent.toString().trim());
		
	}

}
