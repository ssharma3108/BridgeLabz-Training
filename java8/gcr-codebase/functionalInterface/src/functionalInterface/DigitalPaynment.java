package functionalInterface;

interface Pay{
	void pay();
}

class UPI implements Pay{

	@Override
	public void pay() {
		System.out.println("Paynment done by UPI");
	}
	
}
class CreditCard implements Pay{

	@Override
	public void pay() {
		System.out.println("Paynment done by Credit Card");
	}
	
}

class Wallet implements Pay{

	@Override
	public void pay() {
		System.out.println("Paynment done by Wallet");
	}
	
}


public class DigitalPaynment {
public static void main(String[] args) {

	UPI upi =new UPI();
	CreditCard creditCard =new CreditCard();
	Wallet wallet=new Wallet();
	
	upi.pay();
	creditCard.pay();
	wallet.pay();
	
}
}
