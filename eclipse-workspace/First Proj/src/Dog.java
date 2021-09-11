
public class Dog extends Animals {
	public String favFood;
	

	public String getFavFood() {
		return favFood;
	}


	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}


	@Override
	void makeSound() {
		System.out.println(animalType+" dog makes "+soundd+" sound,likes "+favFood);
		
	}

}
