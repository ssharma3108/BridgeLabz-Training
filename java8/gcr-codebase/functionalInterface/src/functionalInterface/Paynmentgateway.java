package functionalInterface;


interface PaynmentProcessor{
	
	default void refund(int amount) {
	System.out.println("Refund of "+amount+" processed Successfully...");
	}
}

class CreditCardPayment implements PaynmentProcessor {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}



public class Paynmentgateway {
public static void main(String[] args) {
	CreditCard card=new CreditCard();
	PaynmentProcessor paynmentProcessor=new CreditCardPayment();
	
	
	paynmentProcessor.refund(100);
	
card.pay();
	
}
}
