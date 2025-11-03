public class CashOnDelivery extends Payment{

    public String deliveryAddress;

    public CashOnDelivery(int amount,String currency ,String status, String deliveryAddress) {
        super(amount, currency, status);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing payment with delivery address...");
    }
}
