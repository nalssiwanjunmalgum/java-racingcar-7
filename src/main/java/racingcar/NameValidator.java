package racingcar;

import java.util.Arrays;

public class NameValidator {
    private static final String COMMA = ",";
    private static final String NAME_REGEX = "^[A-Za-z]{1,5}$";

    public boolean isValidateInput(String input) {
        // 예외를 여기서 던지는게 나은건지?? <-> 별도로 던져야 하는가??
        if (input == null) return false;

        String[] names = input.trim().split(COMMA);
        return Arrays.stream(names).map(String::trim)
                .allMatch(name -> name.matches(NAME_REGEX));
    }
}
