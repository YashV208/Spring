package Aspects;

//import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


//@Aspect    MADE AN ASPECT IN spring.xml.... Equivalent of <aop:aspect id="LoggingAspectXml" ref="Aspects.LoggingAspectXml">

public class LoggingAspectXml {

	
	
	
//	@Before("Pointcutfunction()")     Equivalent of <aop:before pointcut-ref="PointcutFunction" method="LoggingAdvice4" />
	public void LoggingAdvice4(JoinPoint joinpoint) {
		System.out.println("This is a logging advice for "+joinpoint.toString());
	}
	
	
//	@Pointcut("execution(* get*(..))")    Equivalent of <aop:pointcut expression="execution(* get*(..))" id="PointcutFunction"/>
	public void Pointcutfunction() {}
	
}
