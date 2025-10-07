package racingcar;

import java.util.List;

public class GameService {
    private final GameInputScanner gameInputScanner;
    private final GameOutputScreen gameOutputScreen;
    private final NameValidator nameValidator;
    private final NumberValidator numberValidator;

    public GameService(GameInputScanner gameInputScanner,
                       GameOutputScreen gameOutputScreen,
                       NameValidator nameValidator,
                       NumberValidator numberValidator) {
        this.gameInputScanner = gameInputScanner;
        this.gameOutputScreen = gameOutputScreen;
        this.nameValidator = nameValidator;
        this.numberValidator = numberValidator;
    }

    // 이름 등록, 라운드 횟수 등록
    public Game registerInfo() {
        String carNames = gameInputScanner.getCarNames();
        String roundNumber = gameInputScanner.getRound();

        // false 반환하는 경우 생각해야 함
        nameValidator.isValidateInput(carNames);
        numberValidator.isValidateNumber(roundNumber);

        // 완성된 게임 진행하기
        return new Game(carNames, roundNumber);
    }

    public void play(Game game) {
        // 라운드 별 진행 상황 출력하기
        RacingCars racingCarsPerRound = game.playPerRound();
        gameOutputScreen.printStatusPerRound(racingCarsPerRound);
    }

    public void showResult(Game game) {
        // 결과 출력하기
        gameOutputScreen.printWinner(game.getRacingCars());
    }
}
