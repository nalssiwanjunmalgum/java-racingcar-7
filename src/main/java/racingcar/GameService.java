package racingcar;

public class GameService {
    private final GameInputScanner gameInputScanner;
    private final GameOutputScreen gameOutputScreen;
    private final NameValidator nameValidator;
    private final NumberValidator numberValidator;
    private Game game;

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
    public void registerInfo() {
        String carNames = gameInputScanner.getCarNames();
        String roundNumber = gameInputScanner.getRound();

        // false 반환하는 경우 생각해야 함
        if (!(nameValidator.isValidateInput(carNames) && numberValidator.isValidateNumber(roundNumber))) {
            throw new IllegalArgumentException("값을 다시 입력해주세요");
        }

        // 완성된 게임 진행하기
        game = new Game(carNames, roundNumber);
    }

    public void play() {
        gameOutputScreen.printLine();
        gameOutputScreen.printStatusComment();

        // 라운드 별 진행 상황 출력하기
        for(int i = 0; i < game.getRoundNumber(); i++) {
            RacingCars racingCarsPerRound = game.playPerRound();
            gameOutputScreen.printStatusPerRound(racingCarsPerRound);
        }
    }

    public void showResult() {
        // 결과 출력하기
        gameOutputScreen.printWinner(game.getRacingCars());
    }
}
