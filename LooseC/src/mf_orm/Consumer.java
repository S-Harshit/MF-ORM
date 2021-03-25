package mf_orm;

public class Consumer {
	
	IWorker iw;
	Consumer(IWorker iw){
		this.iw=iw;
	}
	
	public void consumer() {
		iw.first();
	}
}