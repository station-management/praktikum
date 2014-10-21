package animal_farm_package;

public class App {

	public static void main(String[] args) {

		Cow cow1 = new Cow(); 
		Cow cow2 = new Cow(); 
		
		cow1.name = "Lilly";
		cow1.age = 16;
		cow1.breed = "no_info_available";
		
		cow2.name = "Felix";
		cow2.age = 12;	
		cow2.breed = "British Shorthair";
		
		System.out.println(cow2 + "'s breed is " + cow2.breed);

		
		Sheep sheep = new Sheep();
		
		sheep.color = "brown";
		sheep.age = 3;
		
		sheep.printAge();
		
	}

}
