package racingcar;

public class Car {
    private int distance;
    private String name;

    public Car(String name) {
        this.distance = 0;
        this.name = name;
    }

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
