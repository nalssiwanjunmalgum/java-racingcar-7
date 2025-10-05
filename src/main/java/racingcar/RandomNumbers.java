package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {
    private final List<Integer> randomNumbers = new ArrayList<>();

    public RandomNumbers(List<Integer> externalNumbers) {
        randomNumbers.addAll(externalNumbers);
    }

    public int getNumberByIndex(int i) {
        return randomNumbers.get(i);
    }
}
