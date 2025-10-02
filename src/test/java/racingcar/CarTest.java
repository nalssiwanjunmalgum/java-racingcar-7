package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

    private String carName = "pobi";
    private Car car = new Car(carName);

    @Test
    void 차가_전진하면_거리는_증가한다(){
        car.move();
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void 차가_전진하지않으면_거리는_동일하다(){
        assertThat(car.getDistance()).isEqualTo(0);
    }

    @Test
    void 차에는_이름이_존재한다(){
        assertThat(car.getName()).isEqualTo("pobi");
    }

    @Test
    void 무작위로_생성된_수가_4이상인_경우에만_전진한다(){
        car.receiveNumber(4);
        assertThat(car.getDistance()).isEqualTo(1);

        car.receiveNumber(4);
        assertThat(car.getDistance()).isEqualTo(2);
    }

    @Test
    void 무작위로_생성된_수가_4보다_작으면_전진하지않는다(){
        car.receiveNumber(4);
        assertThat(car.getDistance()).isEqualTo(1);

        car.receiveNumber(3);
        assertThat(car.getDistance()).isEqualTo(1);
    }
}
