import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("our payment methods\n");
            System.out.println("1) Cash On Delivery");
            System.out.println("2) Bank Transfer");
            System.out.println("3) Credit Card Payment");
            System.out.println("4) Debit Card Payment");
            System.out.println("5) Exit\n");

            System.out.println("Enter your payment method: ");
            int paymentMethod = sc.nextInt();


            PaymentTest paymentTest = new PaymentTest(paymentMethod);


            if(paymentMethod == 5){
                System.exit(0);
            }

        paymentTest.testPayment();


    }
}