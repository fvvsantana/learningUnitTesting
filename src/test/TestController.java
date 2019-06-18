package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import model.characters.GhostModel;
import pacman.Controller;

class TestController {
	
	
	@Test
	void test1() {
		Controller con = new Controller(0);
		GhostModel g = new GhostModel();
		
		g.setRealRow(0.15);
		g.setRealCol(0.17);
		
		assertThrows(NullPointerException.class, ()->{
			con.distanceCharacterPoint(null, 1, 2);
		});
	}
	
	@Test
	void test2() {
		Controller con = new Controller(0);
		GhostModel g = new GhostModel();
		
		g.setRealRow(0.0);
		g.setRealCol(0.0);
		
		assertTrue(con.distanceCharacterPoint(g, 0, 0) == 0, "Distancia incorreta");
	}
	
	@Test
	void test3() {
		Controller con = new Controller(0);
		GhostModel g = new GhostModel();
		
		g.setRealRow(0.2);
		g.setRealCol(0.2);
		
		assertTrue(con.distanceCharacterPoint(g, 4, 4) == Math.sqrt(Math.pow(0.2-4, 2)+Math.pow(0.2-4, 2)), "Distancia incorreta");
	}
}
