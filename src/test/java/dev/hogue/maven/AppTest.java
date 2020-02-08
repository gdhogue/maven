package dev.hogue.maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test of console output :-)
	 */
	@Test
	public void helloWorldTest() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

		System.setOut(new PrintStream(outContent));
		App.main(null);
		assertEquals("Hello World!", outContent.toString());
	}
	
	@Test
	public void objectCreationTest() {
		App helloWorld = new App();
		assertTrue(helloWorld.getClass().desiredAssertionStatus());
	}
}