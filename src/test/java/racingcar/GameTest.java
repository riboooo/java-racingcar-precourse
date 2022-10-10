package racingcar;

import org.junit.jupiter.api.Test;

public class GameTest {

	@Test
	void newGame() {
		Game game = new Game();
		game.play("jun, jake, tim");
	}
}
