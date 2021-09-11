package demoAnnotation;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
		Shape sh= (Shape)context.getBean("circle");
		sh.draw();
		System.out.println(context.getMessage("message", null, "Default Message", null));
		
		

	}

}
