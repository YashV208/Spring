package demo;

public class Cycle implements Vehicle {
	
 private String brand;
 
 public Cycle(String brand) {
	super();
	this.brand = brand;
}

public void drives() {
	 System.out.println("This is a Cycle");
 }
}
