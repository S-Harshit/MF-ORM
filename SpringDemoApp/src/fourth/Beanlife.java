package fourth;

public class Beanlife {
	
	Beanlife() {
		//System.out.println("This is Beanlife Constructor");
	}
	
	void thiswillbecalledfirst() {
		System.out.println("This is init");
	}
	
	void thiswillbecalledlast() {
		System.out.println("This is Destroy");
	}
	
	void bea() {
		System.out.println("beanlife method");
	}
}
