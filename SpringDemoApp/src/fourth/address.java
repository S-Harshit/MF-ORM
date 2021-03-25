package fourth;

public class address {
	
	String state;
	int pincode;
	
	address(String state,int pincode){
		this.state=state;
		this.pincode = pincode;
		//System.out.println("This is Address Constructor");
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
