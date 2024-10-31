package MasteryExercise2;

public class Dealership {

	public static void main(String[] args) 
	{
		Car car = new Car(20.4, 13.5, 5, 16.5, "white", true); // 2025 BMW M5 Sedan
		Truck truck = new Truck(13.1, 9.4, 6, 68.5, "silver", 3729); // 2025 Ram 1500
		Minivan minivan = new Minivan(12.2, 8.5, 8, 144.9, "red", true); // 2025 Honda Odyssey
		
		System.out.println("2025 BMW M5 Sedan");
		System.out.println(car);
		System.out.println("");
		
		System.out.println("2025 RAM 1500");
		System.out.println(truck);
		System.out.println("");
		
		System.out.println("2025 Honda Odyssey");
		System.out.println(minivan);
		System.out.println("");

	}

}
