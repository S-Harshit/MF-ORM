package dependencyinjection;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
class AOPs{
	@After("execution(public String startTraining())")
	public void log() {
		System.out.println("Logged");
	}
}
