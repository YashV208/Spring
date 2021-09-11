import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Service.ShapeService;

public class Main {

	public static void main(String[] args) {

		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shape= (ShapeService)context.getBean("shapeServices");
//		shape.getCircle().setName("This is a circle");
		System.out.println(shape.getCircle().getName());

	}

}
