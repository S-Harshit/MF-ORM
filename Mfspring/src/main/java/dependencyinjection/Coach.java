package dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public interface Coach {
	
	public String startTraining();
	public String stopTraining();
}
