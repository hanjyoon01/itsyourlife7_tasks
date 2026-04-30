public class CardPayment extends Payment {
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
        super(shopName, productName, productPrice);
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }

    @Override
    public void pay() throws PayException {
        if(productPrice <= 0 || monthlyInstallment < 0) {
            throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
        }
        System.out.println("신용카드가 정상적으로 지불되었습니다.");
    }


    public String toString() {
        String sb = "";
        sb += "[ 신용 카드 결제 정보 ]\n";
        sb += "상점명 : " + shopName + "\n";
        sb += "상품명 : " + productName + "\n";
        sb += "상품가격 : " + productPrice + "\n";
        sb += "신용카드번호 : " + cardNumber + "\n";
        sb += "할부개월 : " + monthlyInstallment;
        return sb;
    }
}
