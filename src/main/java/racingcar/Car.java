package racingcar;

public class Car {
    private int distance;
    private String name;

    public Car(String name) {
        this.distance = 0;
        this.name = name;
    }

    // 숫자를 받는다는 느낌인데 이동까지 커버하는 상황.. 이게 맞을까??
    public void receiveNumber(int randomNumber) {
        if (canMove(randomNumber)) {
            move();
        }
    }

    public void move() {
        this.distance++;
    }

    public boolean canMove(int randomNumber) {
        return randomNumber >= 4;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
