package pactest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.characters.GhostModel;
import model.characters.PacManModel;
import utils.GhostState;

class GMgetViewState {

	@Test
	void test1() {
		GhostModel g = new GhostModel();
		g.setState(GhostState.DEAD1);
		assertTrue(g.getViewState() == GhostState.DEAD1, "Estado errado");
	}
	
	@Test
	void test2() {
		GhostModel g = new GhostModel();
		g.setState(GhostState.DEAD2);
		assertTrue(g.getViewState() == GhostState.DEAD1, "Estado errado");
	}
	
	@Test
	void test3() {
		GhostModel g = new GhostModel();
		g.setState(GhostState.NORMAL);
		g.setEatable(PacManModel.POWER_TIME);
		assertTrue(g.getViewState() == GhostState.RUNNING, "Estado errado");
	}
	@Test
	void test4() {
		GhostModel g = new GhostModel();
		g.setState(GhostState.NORMAL);
		g.setEatable(PacManModel.POWER_TIME/5);
		assertTrue(g.getViewState() == GhostState.RUNNING_END, "Estado errado");
	}
	
	@Test
	void test5() {
		GhostModel g = new GhostModel();
		g.setState(GhostState.RUNNING_END);
		g.setEatable(0);
		assertTrue(g.getViewState() == GhostState.NORMAL, "Estado errado");
	}
}
