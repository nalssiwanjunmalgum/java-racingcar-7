package racingcar;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GameOutputScreen {

    private static final String ROUND_LINE = "%s : %s\n";
    private static final String WINNER_LINE = "최종 우승자 : %s\n";
    private static final String DISTANCE_SYMBOL = "-";
    private final StringBuilder stringBuilder = new StringBuilder();

    public void printStatusPerRound(RacingCars racingCars) {
        Map<String, Integer> status = racingCars.getStatus();
        for (Entry<String, Integer> entry : status.entrySet()) {
            String carName = entry.getKey();
            int distance = entry.getValue();
            System.out.printf(ROUND_LINE, carName, DISTANCE_SYMBOL.repeat(distance));
        }
    }

    public void printWinner(RacingCars racingCars) {
        List<Car> winner = racingCars.findWinner();
        // 구분자 넣으면서 문자열 구성하는 방식임
        String formattedWinners = winner.stream().map(Car::getName).collect(Collectors.joining(", "));

        System.out.printf(WINNER_LINE, formattedWinners);
    }
}
