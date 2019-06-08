package pactest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.characters.PacManModel;

class PMUpdateScore {

	@Test
	void testZero() {
		PacManModel pm = new PacManModel();
		pm.updateScore(0);
		assertTrue(pm.getScore() == 0, "Valor incorreto");
	}
	
	@Test
	void testPositive() {
		PacManModel pm = new PacManModel();
		pm.updateScore(1);
		assertTrue(pm.getScore() == 1, "Valor incorreto");
	}
	
	@Test
	void testNegative() {
		PacManModel pm = new PacManModel();
		pm.updateScore(-1);
		assertTrue(pm.getScore() == -1, "Valor incorreto");
	}
	
	@Test
	void testOveflow() {
		PacManModel pm = new PacManModel();
		pm.updateScore(Integer.MAX_VALUE+1);
		assertTrue(pm.getScore() == Integer.MIN_VALUE, "Valor incorreto");
	}
	
	@Test
	void testUnderflow() {
		PacManModel pm = new PacManModel();
		pm.updateScore(Integer.MIN_VALUE-1);
		assertTrue(pm.getScore() == Integer.MAX_VALUE, "Valor incorreto");
	}
	
	@Test
	void testLifeLimit() {
		PacManModel pm = new PacManModel();
		pm.updateScore(10000);
		assertTrue(pm.getLives() == 3, "Número de vidas incorreto.");
	}
	
	@Test
	void testLifeLimitUpper() {
		PacManModel pm = new PacManModel();
		pm.updateScore(10001);
		assertTrue(pm.getLives() == 4, "Acrescimo de vida não efetuado.");
	}
	
	@Test
	void testLifeLimitLower() {
		PacManModel pm = new PacManModel();
		pm.updateScore(9999);
		assertTrue(pm.getLives() == 3, "Número de vidas incorreto.");
	}
}
