package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//		Vehicle v1=(Vehicle)context.getBean("car");
		Vehicle v1=(Vehicle)context.getBean("bike"); 
		Vehicle v2=(Vehicle)context.getBean("bus");  
		Vehicle v3=(Vehicle)context.getBean("cycle");
		System.out.println(v2);
		v1.drives();
		v3.drives();

	}

}
