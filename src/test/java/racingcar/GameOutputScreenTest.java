package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class GameOutputScreenTest extends IOTestSupport{

    private GameOutputScreen gameOutputScreen = new GameOutputScreen();
    private List<String> reusingNames = List.of("pobi", "gabi", "levi");
    private RacingCars racingCars = new RacingCars(reusingNames);

    @Test
    void 구성() {
        gameOutputScreen.printStatusPerRound(racingCars);
        assertThat(capturedOutput()).contains("pobi : ");

        gameOutputScreen.printWinner(racingCars);
        assertThat(capturedOutput()).contains("최종 우승자");
    }
}
