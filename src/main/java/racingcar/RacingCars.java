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

    // 라운드 진행하기 (한 라운드 당)
    public void movePerRound() {
        List<Integer> randomNumbers = RandomNumberGenerator.generateNRandomNumbers(racingCars.size());
        for(int i = 0 ; i < racingCars.size(); i++) {
            racingCars.get(i).receiveNumber(randomNumbers.get(i));
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
