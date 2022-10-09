package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	@DisplayName("차 전진 테스트")
	void run() {
		// given
		Car car = new Car("jun");

		// when
		car.run(4);

		// then
		assertThat(car.getPosition()).isEqualTo(1);
	}
}
