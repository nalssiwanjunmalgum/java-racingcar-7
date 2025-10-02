package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTest {
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @Test
    void 랜덤생성된수는_0_9_사이의_수() {
        // 계속 수가 달라지는데 이런 부분에서는 테스트를 어떻게 작성하면 좋을지 생각해보기
        int randomNumber = randomNumberGenerator.generateNumber();
        assertThat(randomNumber).isBetween(0, 9);
    }
}
