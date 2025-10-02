package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class GameInputScanner {
    private static final String ROUND_MESSAGE = "시도할 횟수는 몇 회인가요?";
    private static final String CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";

    public String getRound() {
        System.out.println(ROUND_MESSAGE);
        return Console.readLine();
    }

    public String getCarNames() {
        System.out.println(CAR_NAME_MESSAGE);
        return Console.readLine();
    }
}
