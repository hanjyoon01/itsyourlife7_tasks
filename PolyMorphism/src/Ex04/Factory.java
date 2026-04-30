package Ex04;

public abstract class Factory {
    private int openHour;
    private int closeHour;
    private String name;

    public  Factory(int openHour, int closeHour, String name) {
        this.openHour = openHour;
        this.closeHour = closeHour;
        this.name = name;
    }

    String getFactoryName() {
        return name;
    }

    int getWorkingTime() {
        return closeHour - openHour;
    }

    public abstract int makeProducts(char skill);
}
