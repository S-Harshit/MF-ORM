package dependencyinjection;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("coach")
public class BaseballCoach implements Coach {

	String name;

	public String getName() {
		return name;
	}

	@Value("${email}")
	public void setName(String name) {
		this.name = name;
	}

	private FortuneService fortune;

	BaseballCoach() {
	}

	@Autowired
	BaseballCoach(FortuneService fortune) {
		this.fortune = fortune;
	}

//	@PostConstruct
//	public void waitin() throws InterruptedException {
//		System.out.println("Training will begin in 3 seconds!!!");
//		TimeUnit.SECONDS.sleep(3);
//	}
//
//	@PreDestroy
//	public void waitin2() throws InterruptedException {
//		System.out.println("Training will end in 3 seconds!!!");
//		// TimeUnit.SECONDS.sleep(5);
//	}

	public String startTraining() {
		return "Training Started, Your Fortune = " + fortune.getFortune();

	}

	public String stopTraining() {
		return "Training Stopped";
	}
	
	

}
