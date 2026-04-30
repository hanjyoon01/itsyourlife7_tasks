package Ex01.Prob1;

public class Drink {
    String name;
    int price;
    int count;

    public Drink(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice(){
        return price*count;
    }

    public void printTitle() {
        System.out.println("상품명     단가      수량      금액");
    }

    public void printData() {
        System.out.printf("%s       %d        %d     %d\n",  name, count, price, count);
    }
}
