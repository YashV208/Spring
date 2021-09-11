package demo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	

	public void drives() {
		System.out.println("This is a Bike");

	}

}
