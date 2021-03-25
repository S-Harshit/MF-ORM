package mf_orm;

import java.util.ResourceBundle;

public class MainConsumer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker fp = Factory.getObject();
		//IWorker p = new Producer();
		Consumer c = new Consumer(fp);
		c.consumer();
	}

}
