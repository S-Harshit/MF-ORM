package mf_orm;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class Factory {
	public static ResourceBundle rb = ResourceBundle.getBundle("config");
	public static IWorker getObject() {
		Object object = null;
		String className = rb.getString("classname");
		
		try {
			object = Class.forName(className).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (IWorker)object;

	}
}
