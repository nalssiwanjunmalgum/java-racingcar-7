package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class NumberValidatorTest {
    private final NumberValidator numberValidator = new NumberValidator();

    // 테스트 해야 하는 문자열도 진행하기
    @Test
    void 정상_입력이면_성공() {
        String numberInput = "5";
        assertThat(numberValidator.isValidateNumber(numberInput)).isEqualTo(true);
    }

    @Test
    void 정상_입력이면_성공_2() {
        String numberInput = "1";
        assertThat(numberValidator.isValidateNumber(numberInput)).isEqualTo(true);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void 실패(String input){
        assertThat(numberValidator.isValidateNumber(input)).isEqualTo(false);
    }
}
