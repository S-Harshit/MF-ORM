package fourth;

public class Cricket{
	private String email;
	private String team;
	Cricket() {
		//System.out.println("Default Constructor of Cricket");
	}
	Cricket(String team){
		this.team=team;
		System.out.println("team");
		//System.out.println("This is Cricket Constructor");
	}
	public void getEmail() {
		System.out.println(email);
	}

	public void setEmail(String email) {
		
		System.out.println("in setter email");
		this.email = email;
	}
 
}
