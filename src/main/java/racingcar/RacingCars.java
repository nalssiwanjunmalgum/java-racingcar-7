package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private final List<Car> racingCars = new ArrayList<>();

    public RacingCars(List<String> carNames) {
        for (String carName : carNames) {
            racingCars.add(new Car(carName));
        }
    }

    public List<Car> getRacingCars() {
        return new ArrayList<>(racingCars);
    }

    // 각각의 수에 제공해야 하는 상황임
}
