package dev.hogue.maven;

import static org.junit.Assert.assertEquals;
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
		App helloWorld = new App();
		helloWorld.main(null);
		assertEquals("Hello World!", outContent.toString());
	}
}