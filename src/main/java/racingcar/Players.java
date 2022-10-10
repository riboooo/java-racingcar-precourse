package racingcar;

import java.util.ArrayList;

import camp.nextstep.edu.missionutils.Randoms;

public class Players {
	private final ArrayList<Car> carList;

	public Players(String carNames) {
		this.carList = generateCar(carNames);
	}

	private ArrayList<Car> generateCar(String carNames) {
		ArrayList<Car> carList = new ArrayList<>();
		for (String name : carNames.split(",")) {
			carList.add(new Car(name));
		}
		return carList;
	}

	public ArrayList<String> getCarNameList() {
		ArrayList<String> nameList = new ArrayList<>();
		for (Car car : this.carList) {
			nameList.add(car.getName());
		}
		return nameList;
	}

	public void run() {
		for (Car car : this.carList) {
			car.run(Randoms.pickNumberInRange(0, 9));
		}
	}

	public String status() {
		String result = "";
		for (Car car : this.carList) {
			result += car.gameStatus() + "\n";
		}
		return result;
	}
}
