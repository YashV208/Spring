package Models;

public class Circle {
	
	private String name;

	public String getName() {
		
//		System.out.println("Circle getter");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle Setter");
	}
	

}
