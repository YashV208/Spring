
public class Frog extends Animals {
	
	public String skinColor;
	
	
	public String getSkinColor() {
		return skinColor;
	}


	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}


	@Override
	void makeSound() {
		System.out.println(animalType+' '+skinColor+" frog makes "+soundd+" sound");
		
	}

}
