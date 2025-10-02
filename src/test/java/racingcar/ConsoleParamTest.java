package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Scanner;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ConsoleParamTest extends IOTestSupport {
    @ParameterizedTest
    @CsvSource({
            "42, ECHO: 42",
            "007, ECHO: 007",
            "abc, ECHO: abc"
    })
    void 여러_입력_검증(String input, String expected) {
        // given
        givenConsoleInput(input + "\n");

        // when
        Scanner sc = new Scanner(System.in);
        System.out.println("ECHO: " + sc.nextLine());

        // then
        assertThat(capturedOutput()).contains(expected);
    }
}
