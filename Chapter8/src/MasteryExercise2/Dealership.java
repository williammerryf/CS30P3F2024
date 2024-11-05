package MasteryExercise2;

/*

Program: Dealership.java          Last Date of this Revision: November 5, 2024

Purpose: User can choose the specs and create their own truck, car, or minivan. 
		 User can also choose to see premade truck, car, and minivan classes.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 
*/

//Import section
import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) 
	{
		
		//Declaration area
		String action, vehicleType, color;
		double fuelEconomyCity, fuelEconomyHwy, cargoVolume;
	    int seatingCapacity, truckSpecific;
		Scanner input = new Scanner(System.in);
		
		//User menu to see premade vehicles or make their own
		System.out.println("(M)ake your own vehicle" + '\n' + 
						   "(S)ee premade vehicles / test the classes");
		action = input.next(); // Record user input
		
		//Display a premade car, truck, and minivan
		if(action.equalsIgnoreCase("s"))
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
		//Display menu for usesr to create their own car, truck, or minivan
		else if(action.equalsIgnoreCase("m"))
		{
			//Collect data for the Vehicle class
			System.out.println("Fuel economy in the city: ");
			fuelEconomyCity = input.nextDouble();
			
			System.out.println("Fuel economy on the highway: ");
			fuelEconomyHwy = input.nextDouble();
			
			System.out.println("Cargo volume: ");
			cargoVolume = input.nextDouble();
			
			System.out.println("Seating capacity: ");
			seatingCapacity = input.nextInt();
			
			//Car, truck, and minivan classes specific variable
			//All classes share this variable so its value is collected here
			System.out.println("Color: ");
			color = input.next();
			
			//User prompt to choose which vehicle class to make
			System.out.println("Create a (C)ar, (T)ruck, or (M)inivan");
			vehicleType = input.next();
			
			//Create a car class
			if(vehicleType.equalsIgnoreCase("c"))
			{
				//Prompt and record class specific data
				System.out.println("Does the car have a sunroof? y/n: ");
				action = input.next();
				
				if(action.equalsIgnoreCase("y"))
				{
					Car car = new Car(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume, color, true);
					System.out.println(car);
				}
				else
				{
					Car car = new Car(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume, color, false);
					System.out.println(car);
				}
								
			}
			
			//Create a minivan class
			else if(vehicleType.equalsIgnoreCase("m"))
			{
				//Prompt and record class specific data
				System.out.println("Does the minivan have sliding doors? y/n: ");
				action = input.next();
				
				if(action.equalsIgnoreCase("y"))
				{
					Minivan minivan = new Minivan(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume, color, true);
					System.out.println(minivan);
				}
				else
				{
					Minivan minivan = new Minivan(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume, color, false);
					System.out.println(minivan);
				}
			}
			//Create a truck class
			else
			{
				//Prompt and record class specific data
				System.out.println("What's the truck's towing capacity: ");
				truckSpecific = input.nextInt();
				
				Truck truck = new Truck(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume, color, truckSpecific);
				System.out.println(truck);

			}
			
		}
		input.close(); //Close user input

	}

}

/*

Test Cases

//Test Case 1//

(M)ake your own vehicle
(S)ee premade vehicles / test the classes
S
2025 BMW M5 Sedan
The fuel economy for the city and highway respectively is: 20.4 L/100Km , 13.5 L/Km.
The seating capacity is 5 people.
The cargo volume is 16.5 ft^3.
The car is white and has a sunroof.

2025 RAM 1500
The fuel economy for the city and highway respectively is: 13.1 L/100Km , 9.4 L/Km.
The seating capacity is 6 people.
The cargo volume is 68.5 ft^3.
The truck is silver and has a towing capacity of 3729.0 kgs.

2025 Honda Odyssey
The fuel economy for the city and highway respectively is: 12.2 L/100Km , 8.5 L/Km.
The seating capacity is 8 people.
The cargo volume is 144.9 ft^3.
The minivan is red and has sliding doors.

//Test Case 2//

(M)ake your own vehicle
(S)ee premade vehicles / test the classes
m
Fuel economy in the city: 
1
Fuel economy on the highway: 
2
Cargo volume: 
3
Seating capacity: 
4
Color: 
brown
Create a (C)ar, (T)ruck, or (M)inivan
c
Does the car have a sunroof? y/n: 
y
The fuel economy for the city and highway respectively is: 1.0 L/100Km , 2.0 L/Km.
The seating capacity is 4 people.
The cargo volume is 3.0 ft^3.
The car is brown and has a sunroof.

//Test Case 3//

(M)ake your own vehicle
(S)ee premade vehicles / test the classes
m
Fuel economy in the city: 
5
Fuel economy on the highway: 
6
Cargo volume: 
7
Seating capacity: 
8
Color: 
red
Create a (C)ar, (T)ruck, or (M)inivan
t
What's the truck's towing capacity: 
9999
The fuel economy for the city and highway respectively is: 5.0 L/100Km , 6.0 L/Km.
The seating capacity is 8 people.
The cargo volume is 7.0 ft^3.
The truck is red and has a towing capacity of 9999.0 kgs.

*/
