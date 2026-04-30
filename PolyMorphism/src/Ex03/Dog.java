package Ex03;

public class Dog extends Animal {
    public Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance += 0.5 * speed * hours;
    }
}
