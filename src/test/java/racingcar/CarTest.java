package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

    private String carName = "pobi";

    @Test
    void 차가_전진하면_거리는_증가한다(){
        Car car = new Car(carName);
        car.move();
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void 차가_전진하지않으면_거리는_동일하다(){
        Car car = new Car(carName);
        assertThat(car.getDistance()).isEqualTo(0);
    }

    @Test
    void 차에는_이름이_존재한다(){
        Car car = new Car("pobi");
        assertThat(car.getName()).isEqualTo("pobi");
    }
}
