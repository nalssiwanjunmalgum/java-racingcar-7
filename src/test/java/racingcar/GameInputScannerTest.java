package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GameInputScannerTest extends IOTestSupport {
    private final GameInputScanner gameInputScanner = new GameInputScanner();

    // Console로 입력을 받아야 하는 경우 테스트를 어떻게 해야하는지??
    @Test
    void input_Number() {
        givenConsoleInput("1\n");
        String round = gameInputScanner.getRound();
        assertThat(round).isEqualTo("1");
    }

    @Test
    void input_Car_Names() {
        givenConsoleInput("pobi,juni\n");
        String round = gameInputScanner.getCarNames();
        assertThat(round).isEqualTo("pobi,juni");
    }
}
