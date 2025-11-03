public class PaymentTest {

    int choice;

    public PaymentTest(int choice) {
        this.choice = choice;
    }

    CashOnDelivery cod = new CashOnDelivery(3000, "LKR", "Pending", "Kandy Sri Lanka");
    BankTransfer bt = new BankTransfer(3000, "LKR", "Pending", "BOC", "087247188412", "ihsd3425ggfgedgs");
    CreditCardPayment ccp = new CreditCardPayment(5000, "USD", "Approved", "4111111111111111", "John Doe", "12/28", 10000.00);
    DebitCardPayment dcp =  new DebitCardPayment(5000,"LKR","Pending","3812746194312","Janidu","2-09-2029",67000);

    public void testPayment(){


            if(this.choice == 1){
                cod.processPayment();
                cod.generateReceipt();
            }
            else if(this.choice ==2){
                bt.processPayment();
                bt.generateReceipt();
            }
            else if(this.choice ==3){
                ccp.processPayment();
                ccp.generateReceipt();
            }
            else if(this.choice ==4){
                dcp.processPayment();
                dcp.generateReceipt();
            }
            else {
                System.out.println("Invalid payment method");
            }

    }
}
