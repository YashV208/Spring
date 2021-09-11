
public class Sounds {

	public static void main(String[] args) {
		Cow cowObj=new Cow();
		Dog dogObj=new Dog();
		Frog frogObj=new Frog();
		
		cowObj.soundd="Moooo";
		cowObj.animalType="Herbivore";
		cowObj.setBreed("Jersey");
		
		dogObj.soundd="Wooffff";
		dogObj.animalType="Omnivore";
		dogObj.setFavFood("Chicken");
		
		frogObj.soundd="Croak Croak";
		frogObj.animalType="Amphibian";
		frogObj.setSkinColor("Brown");
		
		
		cowObj.makeSound();
		dogObj.makeSound();
		frogObj.makeSound();
		

	}

}
