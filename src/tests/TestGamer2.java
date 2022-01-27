package tests;
import model.Gamer;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Owen Miner - osminer
 * CIS175 - Fall 2021
 * Jan 27, 2022
 */
public class TestGamer2 {
	Gamer g1 = new Gamer();
	Gamer g2 = new Gamer();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}
	
	
	@Test
	public void testIsGamerFalse2() { //testing isGamer method
		
		g1.setFavoriteGame("Call of Duty: Black Ops");
		g1.setTotalGames(1);
		assertFalse(g1.isGamer());
	}
	
	@Test
	public void testIsGamerTrue2() { //testing isGamer method
		g1.setFavoriteGame("Skyrim");
		g1.setTotalGames(20);
		assertTrue(g1.isGamer());
		
	}
	
	@Test
	public void testBiggerGamer2() { //testing biggerGamer method
			g1.setName("Tim");
			g1.setTotalGames(15);
			
			g2.setName("Joe");
			g2.setTotalGames(1);
		
			assertEquals("Tim", g1.biggerGamer(g1, g2));
		
	}

}
