package Ex03;

public abstract class Animal {
    int speed;
    double distance = 0;

    public Animal(int speed) {
        this.speed = speed;
    }

    abstract void run(int hours);

    double getDistance() {
        return distance;
    }
}
