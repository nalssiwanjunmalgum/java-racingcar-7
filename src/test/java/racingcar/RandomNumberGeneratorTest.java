package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTest {

    @Test
    void 랜덤생성된수는_0_9_사이의_수() {
        // 계속 수가 달라지는데 이런 부분에서는 테스트를 어떻게 작성하면 좋을지 생각해보기
        List<Integer> randomNumber = RandomNumberGenerator.generateNRandomNumbers(1);
        assertThat(randomNumber).allMatch(num -> num >= 0 && num <= 9);
    }
}
