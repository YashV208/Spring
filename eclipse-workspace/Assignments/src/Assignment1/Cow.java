package Assignment1;


public class Cow extends Animals {
	public String breed;
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	void makeSound() {
		System.out.println(animalType+' '+breed+" Cow makes "+soundd+" sound");
		
	}

}

