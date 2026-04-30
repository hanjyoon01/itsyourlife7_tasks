public abstract class Payment implements Payable {
    String shopName;
    String productName;
    long productPrice;

    public Payment(String shopName, String productName, long productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
