package racingcar;

public class Car {
    private int distance;
    private String name;

    public Car(String name) {
        this.distance = 0;
        this.name = name;
    }

    public void move() {
        this.distance++;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
