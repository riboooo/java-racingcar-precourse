package racingcar;

public class Car {
	private final String name;
	private int position;

	public Car(String name) {
		this.name = name;
		this.position = 0;
	}

	public void run(int number) {
		if (number > 3) {
			this.position += 1;
		}
	}

	public int getPosition() {
		return this.position;
	}

	public String getName() {
		return name;
	}
}
