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
public class TestGamer1 {
	Gamer g1 = new Gamer("Owen", "CSGO", 120);
	Gamer g2 = new Gamer("Traci");
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBiggerGamer() { //Tests biggerGamer method
		g2.setTotalGames(2);
		String games = g1.biggerGamer(g1, g2);
		assertEquals("Owen", games);	
	}
	@Test
	public void testIsGamerFalse() { //tests isGamer method
		g2.setTotalGames(10);
		assertFalse(g2.isGamer());
	}
	
	@Test
	public void testIsGamerTrue() {	//tests isGamer method
		g2.setFavoriteGame("Tetris");
		g2.setTotalGames((10));
		assertTrue(g2.isGamer());
	}

}
