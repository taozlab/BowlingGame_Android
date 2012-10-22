package TestGame;

import com.bowlinggame.Pins;

import junit.framework.TestCase;

public class PinsTester extends TestCase {
	private Pins p;

	protected void setUp() throws Exception {
		super.setUp();
		p = new Pins();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testNoValidPins()
	{
		for (int i=0; i<p.getCount(); i++)
		{
			assertEquals(-1, p.getPinByPos(i));
		}
		assertEquals(0, p.getValidCount());
	}

	public void testAllValidPins()
	{
		for (int i=0; i<p.getCount(); i++)
		{
			assertEquals(i, p.setPinByPos(i, i));
		}
		for (int i=0; i<p.getCount();i++)
		{
			assertEquals(i, p.getPinByPos(i));
		}
		assertEquals(p.getCount(), p.getValidCount());
	}
	
	public void testOneValidPins()
	{
		assertEquals(0, p.setPinByPos(0, 0));
		assertEquals(1, p.getValidCount());
	}
	
	public void testIllegalSetPins()
	{
		assertEquals(1, p.setPinByPos(1, 0));
		assertEquals(0, p.getValidCount());
	}

}
