package racingcar;

public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    public void init() {
        gameService.registerInfo();
    }

    public void execute() {
        gameService.play();
        gameService.showResult();
    }

}
