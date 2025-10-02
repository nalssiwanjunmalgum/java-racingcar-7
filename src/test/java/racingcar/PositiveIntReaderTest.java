package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PositiveIntReaderTest extends IOTestSupport {
    @Test
    void 잘못된_입력_후_정상값_재시도() {
        // 사용자 입력 시나리오: "abc" -> "-2" -> "0" -> "123"
        givenConsoleInput("abc\n-2\n0\n123\n");

        int value = readPositiveInt();

        assertThat(value).isEqualTo(123);

        String out = capturedOutput();
        // 에러 메시지 횟수, 프롬프트 노출 여부 등 검증
        long invalidCount = out.lines().filter(l -> l.contains("Invalid input")).count();
        assertThat(invalidCount).isEqualTo(3);
        assertThat(out).contains("Enter a positive integer");
    }

    // 예시 구현 (테스트 대상)
    private int readPositiveInt() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive integer: ");
            String s = sc.nextLine().trim();
            if (s.matches("\\d+")) { // 양수(0 포함) 형식
                try {
                    int v = Integer.parseInt(s);
                    if (v > 0) return v; // 0 제외
                } catch (NumberFormatException ignore) {}
            }
            System.out.println("Invalid input");
        }
    }
}
