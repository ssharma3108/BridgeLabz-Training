package functionalInterface;

interface Behaviour{
	 
	void turnOn();
	void turnOff();
	
}

//make different class for light, tv and ac

class Light implements Behaviour{

	@Override
	public void turnOn() {
		System.out.println("Light is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Light is off");
		
	}
	
}

class AC implements Behaviour{

	@Override
	public void turnOn() {
		System.out.println("AC is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("AC is off");
		
	}
	
}


class TV implements Behaviour{

	@Override
	public void turnOn() {
		System.out.println("TV is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV is off");
		
	}
	
}

public class SmartDeviceControl {
	public static void main(String[] args) {
		Light light =new Light();
		
		light.turnOn();
		
		light.turnOff();
		
		
		AC ac=new AC();
		
		ac.turnOff();
		ac.turnOn();
		
		
		TV tv=new TV();
		
		tv.turnOff();
		tv.turnOn();
		
		
	}
}
