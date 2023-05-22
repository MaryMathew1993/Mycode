
public class Bank {
	private int pin1 = 1001;
	private int pin2 = 1234;
	private int pin3 = 1212;
	private int myPin;

	public void setMyPin(int myPin) {
		this.myPin = myPin;
	}
	
	public int getMyPin() {
		return myPin;
	}

	public boolean validate() {
		if (myPin == pin1 || myPin == pin2 || myPin == pin3) {
			return true;
		} else {
			return false;
		}
	}
}
