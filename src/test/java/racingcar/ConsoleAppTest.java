package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class ConsoleAppTest extends IOTestSupport{
    @Test
    void 콘솔_입출력_단일_케이스() {
        // given
        givenConsoleInput("hello\n");

        // when: 실제 콘솔 읽고 쓰는 코드 (예시)
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("ECHO: " + s);

        // then
        assertThat(capturedOutput()).contains("ECHO: hello");
    }
}
