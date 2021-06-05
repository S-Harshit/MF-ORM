package dependencyinjection;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("fortune")
@PropertySource("classpath:config/config.properties")
public class HappyFortuneService implements FortuneService{
	
	@Value("${arrtry}")
	String arr[] = new String[3];
	
	Random ran = new Random();
	
	public String getFortune() {
		return arr[ran.nextInt(3)].toString();
	}
	
	public String getAnotherFortune() {
		return "Just a Another Forutne";
	}
}
