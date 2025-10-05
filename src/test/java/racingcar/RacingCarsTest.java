package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class RacingCarsTest {
    private List<String> reusingNames = List.of("pobi", "gabi", "levi");
    private RacingCars racingCars = new RacingCars(reusingNames);

    @Test
    void 구성() {
        List<Car> cars = racingCars.getRacingCars();
        assertThat(cars.size()).isEqualTo(3);

        assertThat(cars.get(0).getName()).isEqualTo("pobi");
        assertThat(cars.get(1).getName()).isEqualTo("gabi");
        assertThat(cars.get(2).getName()).isEqualTo("levi");
    }

    @Test
    void Random수_생성_이동_확인하기() {
        RandomNumbers randomNumbers = new RandomNumbers(List.of(1, 4, 9));
        racingCars.movePerRound(randomNumbers);

        List<Car> cars = racingCars.getRacingCars();

        assertThat(cars.get(0).getDistance()).isEqualTo(0);
        assertThat(cars.get(1).getDistance()).isEqualTo(1);
        assertThat(cars.get(2).getDistance()).isEqualTo(1);
    }

    @Test
    void 단독_우승자_찾기() {
        RandomNumbers firstRoundNumbers = new RandomNumbers(List.of(1, 4, 9));
        RandomNumbers secondRoundNumbers = new RandomNumbers(List.of(4, 9, 1));
        RandomNumbers thirdRoundNumbers = new RandomNumbers(List.of(2, 2, 0));

        racingCars.movePerRound(firstRoundNumbers);
        racingCars.movePerRound(secondRoundNumbers);
        racingCars.movePerRound(thirdRoundNumbers);

        List<Car> cars = racingCars.getRacingCars();

        assertThat(cars.get(0).getDistance()).isEqualTo(1);
        assertThat(cars.get(1).getDistance()).isEqualTo(2);
        assertThat(cars.get(2).getDistance()).isEqualTo(1);

        List<Car> winners = racingCars.findWinner();

        assertThat(winners).containsExactly(cars.get(1));
    }

    @Test
    void 복수_우승자_찾기() {
        RandomNumbers firstRoundNumbers = new RandomNumbers(List.of(1, 4, 9));
        RandomNumbers secondRoundNumbers = new RandomNumbers(List.of(4, 9, 1));
        RandomNumbers thirdRoundNumbers = new RandomNumbers(List.of(2, 2, 7));

        racingCars.movePerRound(firstRoundNumbers);
        racingCars.movePerRound(secondRoundNumbers);
        racingCars.movePerRound(thirdRoundNumbers);

        List<Car> cars = racingCars.getRacingCars();

        assertThat(cars.get(0).getDistance()).isEqualTo(1);
        assertThat(cars.get(1).getDistance()).isEqualTo(2);
        assertThat(cars.get(2).getDistance()).isEqualTo(2);

        List<Car> winners = racingCars.findWinner();

        assertThat(winners).containsExactly(cars.get(1), cars.get(2));
    }


}
