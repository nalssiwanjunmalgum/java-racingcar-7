package racingcar;

import java.util.Arrays;

public class NameValidator {
    private static final String COMMA = ",";
    private static final String NAME_REGEX = "^[A-Za-z]{1,5}$";

    public boolean isValidateInput(String input) {
        String[] names = input.trim().split(COMMA);
        return Arrays.stream(names).map(String::trim)
                .allMatch(name -> name.matches(NAME_REGEX));
    }
}
