package racingcar;

import org.junit.jupiter.api.Test;

public class GameInputScannerTest {
    private final GameInputScanner gameInputScanner = new GameInputScanner();

    // Console로 입력을 받아야 하는 경우 테스트를 어떻게 해야하는지??
    @Test
    void input() {
        gameInputScanner.getRound();
    }
}
