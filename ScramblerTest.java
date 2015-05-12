import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ScramblerTest {

	@Test
	public void thingtest() {
		assertEquals("tnihg", Scrambler.Scramble("thing"));
	}
	
	@Test
	public void wholetest() {
		assertEquals("wlohe", Scrambler.Scramble("whole"));
	}
	
	@Test
	public void importanttest() {
		assertEquals("inatropmt", Scrambler.Scramble("important"));
	}
	
	@Test
	public void problemtest() {
		assertEquals("pelborm", Scrambler.Scramble("problem"));
	}
	
	@Test
	public void texttest() {
		assertEquals("Tihs is a slpmae txet", Scrambler.Scramble("This is a sample text"));
	}
	
	@Test
	public void emptytest() {
		assertEquals("", Scrambler.Scramble(""));
	}
}
