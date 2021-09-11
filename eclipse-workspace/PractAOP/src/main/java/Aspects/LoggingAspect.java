package Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class LoggingAspect {
	@Before("execution(public String getName())")
	public void LoggingAdvice() {
		System.out.println("This is logging advice");
	}
	@Before("execution(* get*(..))")
	public void LoggingAdvice2() {
		System.out.println("This is a logging advoce for all the getters across classes irrespective of 'Return Type','Access Specifier' or the Arguments");
	}
	
	@Before("Pointcutfunction()")
	public void LoggingAdvice3() {
		System.out.println("This is a logging advoce 3");
	}
	
	@Before("Pointcutfunction()")
	public void LoggingAdvice4() {
		System.out.println("This is a logging advoce 4");
	}
	
	@After("args(name)")
	public static void StringArgumentMethod(String name){
		System.out.println("This is a string method called for"+name);
	}
	
	@Pointcut("execution(* get*(..))")
	public void Pointcutfunction() {}
	
	

}
