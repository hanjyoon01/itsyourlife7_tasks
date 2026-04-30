package Ex04;

public class CarFactory extends Factory implements IWorkingTogether{
    public CarFactory(String name, int openHour, int closeHour) {
        super(openHour, closeHour, name);
    }

    @Override
    public int makeProducts(char skill) {
        if(skill == 'A') {
            return 3 * getWorkingTime();
        } else if (skill == 'B') {
            return 2 * getWorkingTime();
        } else if (skill == 'C') {
            return getWorkingTime();
        } else {
            return 0;
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        if (partner instanceof TVFactory) {
            return  ((TVFactory) partner).makeProducts('B');
        } else if (partner instanceof CarFactory) {
            return  ((CarFactory) partner).makeProducts('B');
        }  else {
            return 0;
        }
    }
}
