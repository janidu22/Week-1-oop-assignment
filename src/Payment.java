public class Payment {

    public int amount;
    public String currency;
    public String status;

    public Payment(int amount, String currency, String status) {
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    public void processPayment() {
        System.out.println("Processing generic payment...");
    }

    public void generateReceipt() {
        System.out.println("your receipt ");
        System.out.println("Amount: " + this.amount + " currency: " + this.currency + " status: " + this.status);
    }

    public String markAsCompleted(){
     return  this.status = "COMPLETED";
    }

}
