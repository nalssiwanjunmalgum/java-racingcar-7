package racingcar;

import java.util.List;

public class Game {
    private final RacingCars racingCars;
    private final int roundNumber;

    public Game(String names, String round) {
        // 검증된 값만 들어온다고 생각하고
        String[] nameCandidates = names.split(",");
        List<String> carNames = List.of(nameCandidates);
        racingCars = new RacingCars(carNames);
        roundNumber = Integer.parseInt(round);
    }

    public RacingCars playPerRound() {
        RandomNumbers randomNumbers = new RandomNumbers(
                RandomNumberGenerator.generateNRandomNumbers(racingCars.getRacingCars().size()));
        racingCars.movePerRound(randomNumbers);
        return racingCars;
    }

    public RacingCars getRacingCars() {
        return racingCars;
    }

    public int getRoundNumber() {
        return roundNumber;
    }
}
