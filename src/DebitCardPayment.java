public class DebitCardPayment extends CardPayment {

    public double availableBalance;

    public DebitCardPayment(int amount, String currency, String status, String cardNumber, String cardHolderName, String expirationDate, double availableBalance) {
        super(amount, currency, status, cardNumber, cardHolderName, expirationDate);
        this.availableBalance = availableBalance;
    }

    @Override
    public void processPayment() {
        System.out.println("Debiting from account balance " + this.availableBalance+ " for amount " + this.amount);
    }

    public void checkSufficientBalance(){
        System.out.println("Checking if balance covers amount ");
    }
}
