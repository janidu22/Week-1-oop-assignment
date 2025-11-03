public class CardPayment extends Payment{

    public String cardNumber;
    public String cardHolderName;
    public String expirationDate;

    public CardPayment(int amount, String currency, String status, String cardNumber, String cardHolderName, String expirationDate) {
        super(amount, currency, status);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void processPayment(){
        System.out.println("Authorizing card payment for " + this.cardHolderName +  " ...");
    }

    public void validateCard(){
        System.out.println("validating card number format...");
    }
}
