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
	// Test for object creation (also maximize test coverage)
	@Test
	public void objectCreationTest() {
		App helloWorld = new App();
		assertTrue(helloWorld.getClass().desiredAssertionStatus());
	}

	/**
	 * Rigorous Test of console output :-)
	 */
	@Test
	public void helloWorldTest() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final String[] test = { "One", "Two", "Three", "Four" };

		System.setOut(new PrintStream(outContent));
		App.main(test);
		assertEquals("Hello World!", outContent.toString());
	}
}