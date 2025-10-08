package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameController gameController = new GameController(
                new GameService(
                        new GameInputScanner(),
                        new GameOutputScreen(),
                        new NameValidator(),
                        new NumberValidator()
                )
        );

        // 자동차 이름 입력하기
        // 시도할 횟수  입력받기
        gameController.init();

        // 실행 결과
        // 라운별로 현황 출력하기
        gameController.execute();
        // 최종 우승자 출력하기
    }
}
