package fourth;

public class Baseball implements Coach{
	
	private Ifortune ob;
	
	Baseball(){
		//System.out.println("This is Baseball Constructor");	
	}
	
	public Baseball(Ifortune ob) {
		this.ob=ob;
	}
	
	public void getDailyW() {
		System.out.println("Workout)");
	}
	
	public void getDailyFortune() {
		ob.getFortune();
	}


}
