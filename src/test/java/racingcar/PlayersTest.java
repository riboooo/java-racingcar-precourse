package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PlayersTest {
	@Test
	void createPlayer() {
		Players players = new Players("jun,jack,tim");
		assertThat(players.getCarNameList()).contains("jun", "jack", "tim");
	}

}
