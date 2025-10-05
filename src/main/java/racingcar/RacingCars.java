package racingcar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    // 라운드 하나 진행하기
    public void movePerRound(RandomNumbers randomNumbers) {
        // ! RandomNumbers 와 크기가 서로 다른 경우에는??
        for(int i = 0; i < racingCars.size(); i++) {
            Car car = racingCars.get(i);
            int randomNumber = randomNumbers.getNumberByIndex(i);
            car.receiveNumber(randomNumber);
        }
    }

    // 우승자 찾기
    public List<Car> findWinner() {
        int maxDistance = racingCars.stream().map(Car::getDistance).
                max(Comparator.naturalOrder()).orElseThrow(IllegalArgumentException::new);

        return racingCars.stream().filter(car -> car.getDistance() == maxDistance)
                .collect(Collectors.toList());
    }
}
