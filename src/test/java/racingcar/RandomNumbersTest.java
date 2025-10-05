package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class RandomNumbersTest {

    private RandomNumbers randomNumbers = new RandomNumbers(List.of(1, 4, 9));

    @Test
    void 구성() {
        assertThat(randomNumbers.getNumberByIndex(0)).isEqualTo(1);
        assertThat(randomNumbers.getNumberByIndex(1)).isEqualTo(4);
        assertThat(randomNumbers.getNumberByIndex(2)).isEqualTo(9);
    }

    @Test
    void 임의() {

    }
}
