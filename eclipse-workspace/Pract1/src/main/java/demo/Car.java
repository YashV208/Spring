package demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	public void drives() {
		System.out.println("This Is a car");
	}
	
}
