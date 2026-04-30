package Ex04;

public class TVFactory extends Factory implements IWorkingTogether {
    public TVFactory(String name, int openHour, int closeHour) {
        super(openHour, closeHour, name);
    }

    @Override
    public int makeProducts(char skill) {
        if(skill == 'A') {
            return 8 * getWorkingTime();
        } else if (skill == 'B') {
            return 5 * getWorkingTime();
        } else if (skill == 'C') {
            return 3 * getWorkingTime();
        } else {
            return getWorkingTime();
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        if (partner instanceof TVFactory) {
            return  ((TVFactory) partner).makeProducts('C');
        } else if (partner instanceof CarFactory) {
            return  ((CarFactory) partner).makeProducts('C');
        }  else {
            return 0;
        }
    }
}
