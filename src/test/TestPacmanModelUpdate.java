package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.characters.PacManModel;

class TestPacmanModelUpdate{

	@Test
	void test1() {
		PacManModel pm = new PacManModel();
		pm.setPowerful(false);
		pm.setCounter(0);
		
		pm.update();
		assertTrue(pm.getCounter() == 0, "Erro de condição");
	}

	@Test
	void test2() {
		PacManModel pm = new PacManModel();
		pm.setPowerful(false);
		pm.setCounter(PacManModel.POWER_TIME);
		
		pm.update();
		assertTrue(pm.getCounter() == 420, "Erro de condição");
	}
	
	@Test
	void test3() {
		PacManModel pm = new PacManModel();
		pm.setPowerful(true);
		pm.setCounter(0);
		
		pm.update();
		assertTrue(pm.getCounter() == 1, "Erro de condição");
	}
	
	@Test
	void test4() {
		PacManModel pm = new PacManModel();
		pm.setPowerful(true);
		pm.setCounter(pm.POWER_TIME);
		
		pm.update();
		assertTrue(pm.getCounter() == 0, "Erro de condição");
	}
	
	

}
