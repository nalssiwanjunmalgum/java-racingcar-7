package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class NameValidatorTest {
    private final NameValidator nameValidator = new NameValidator();

    // (입력) 자동차 이름은 ',' 로 구분하고 이름은 5자 이하만 가능하다
    @Test
    void COMMA_포함_5자_이하인_문자열은_성공() {
        // pobi / pobi,jun / pobi,jun,lilka
        String acceptedInput = "pobi   ,  junie";
        assertThat(nameValidator.isValidateInput(acceptedInput)).isEqualTo(true);
    }

    @Test
    void COMMA_포함_5자_초과인_문자열은_실패() {
        // pobi / pobi,jun / pobi,jun,lilka
        String acceptedInput = "pobi   ,  junied";
        assertThat(nameValidator.isValidateInput(acceptedInput)).isEqualTo(false);
    }

    // 한번에 여러가지 parameter 테스트 하는 방법은??
}
