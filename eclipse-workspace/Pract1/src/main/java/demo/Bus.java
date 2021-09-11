package demo;

public class Bus implements Vehicle {

	private String brand;
	
	@Override
	public String toString() {
		return "Bus [brand=" + brand + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void drives() {
		System.out.println("This is a bus");

	}

}
