package Ex02.Prob1;

public class Tv {
    private String color;
    private boolean power;
    private int channel;

    public Tv() {
        color = "black";
        power = false;
        channel = 0;
    }

    public void power() {
        power = !power;
    }

    public void channelUp() {
        channel += 1;
    }

    public void print() {
        System.out.printf("color : %s   power:%b    channel:%d\n", color, power, channel);
    }

}
