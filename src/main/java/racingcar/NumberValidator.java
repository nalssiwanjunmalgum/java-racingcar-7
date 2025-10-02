package racingcar;

public class NumberValidator {
    private static final String NUMBER_REGEX = "^\\d+$";
    
    public boolean isValidateNumber(String numberInput) {
        return numberInput != null && numberInput.trim().matches(NUMBER_REGEX);
    }
}
