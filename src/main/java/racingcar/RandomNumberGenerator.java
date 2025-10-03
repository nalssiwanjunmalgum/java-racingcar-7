package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {

    private static int generateNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public static List<Integer> generateNRandomNumbers(int count) {
        List<Integer> randomNumbers = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            randomNumbers.add(generateNumber());
        }

        return randomNumbers;
    }
}
