package Challenges;

/*

Program: Square.java          Last Date of this Revision: December 3, 2024

Purpose: An application that moves the rover around in a square. 
If an object is detected it will turn around and go in a square the opposite way.

Author: William Merryfield 
School: CHHS
Course: CSE3910 - Project D
 

*/

// Import Phidgets Library
import com.phidget22.*;

public class Square 
{

	// Static variables
	public static int counter = 0; // Keeps track of how far up one square side length the rover has traveled
	public static int turnCounter = 0; // Keeps track of the amount of 180 degree turns
	
	// Main method
	public static void main(String[] args) throws Exception 
	{
		// Declaration area
		int sideLengths = 0; // Used to keep track of the while loop
		
		// Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);
        
        // Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();
        
        // Address
        leftMotors.setChannel(1);
        rightMotors.setChannel(0);

        // Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);
        
        // Loops 10 times, 10 has no significant value and can be any number
        // The purpose of the loop is to travel the outline of a square, turn around and travel the same outline but in the opposite direction if obstruction is detected
        while(sideLengths != 10)
        {     	
        	// Start with a stop to give the rover a break
        	// The rover seems to work better if it doesn't have to run back to back with different types of movement
        	oneSecStop(leftMotors, rightMotors);
        	
        	// If the rover is traveling in the normal/original direction
        	if (turnCounter % 2 == 0)
        	{
        		normDirection(leftMotors, rightMotors, sonar);
        		
        		// If an object is detected the rover will turn around
        		if (sonar.getDistance() < 200)
        		{
        			turnAround(leftMotors, rightMotors);
        		}
        		
        	}
        	// If the rover is traveling in the opposite direction
        	else
        	{
        		revDirection(leftMotors, rightMotors, sonar);
        		
        		// If an object is detected the rover will turn around
        		if (sonar.getDistance() < 200)
        		{
        			turnAround(leftMotors, rightMotors);
        		}
        		
        	}
        	
        	// Update variable
        	sideLengths++;
            
            Thread.sleep(100);
        }

	 }
	
	// Cause the rover to move up one side of the square, stop, and turn 90 degrees in order to get ready to go up that side
	// Rover travels up one side of the square, stops, and turns 90 degrees
	// Rover will stop if an object is detected
	private static void normDirection(DCMotor lM, DCMotor rM, DistanceSensor s) throws Exception 
	{
        while(counter != 23) // About the distance of a meter
        {
        	lM.setTargetVelocity(0.45);
            rM.setTargetVelocity(0.45);
            counter++; // Update counter
            Thread.sleep(100);
            
            // Break while loop if an object is detected
            if (s.getDistance() < 200)
            {
            	break;
            }
        }
        
        // If the rover went the full side length it will stop and turn 90 degrees
        // Preparation to continue up the perpendicular side length
        if(counter == 23)
        {
        	// Turn 90 degrees in one direction
            lM.setTargetVelocity(-0.9); // Rover turns better if the outside wheel goes faster than the inside wheel
            rM.setTargetVelocity(0.8);

            Thread.sleep(600); // Roughly enough time for a 90 degree turn
            
            counter = 0; // Reset counter upon completion of one side of the square

        }

        // Stop rover
        lM.setTargetVelocity(0);
        rM.setTargetVelocity(0);
        Thread.sleep(1000);
        
	}
	
	// Cause the rover to move up one side of the square, stop, and turn 90 degrees in order to get ready to go up that side
	// Direction and turns are opposite of the normDirection() method since the rover is traveling in the reverse order
	// Rover travels up one side of the square, stops, and turns 90 degrees
	// Rover will stop if an object is detected
	// Direction and turns are opposite of the normDirection() method since it travels up the square in the opposite direction
	private static void revDirection(DCMotor lM, DCMotor rM, DistanceSensor s) throws Exception 
	{
        while(counter != 23) // About the distance of a meter
        {
        	lM.setTargetVelocity(0.45);
            rM.setTargetVelocity(0.45);
            counter++; // Update counter
            Thread.sleep(100);
            
            // Break while loop if an object is detected
            if (s.getDistance() < 200)
            {
            	break;
            }
        }
        
        // If the rover went the full side length it will stop and turn 90 degrees
        // Preparation to continue up the perpendicular side length
        if(counter == 23)
        {
        	// Turn 90 degrees in one direction
            lM.setTargetVelocity(0.8);
            rM.setTargetVelocity(-0.9); // Rover turns better if the outside wheel goes faster than the inside wheel

            Thread.sleep(600); // Roughly enough time for a 90 degree turn 

            counter = 0; // Reset counter upon completion of one side of the square

        }
        
        // Stop rover
        lM.setTargetVelocity(0);
        rM.setTargetVelocity(0);
        Thread.sleep(1000);
        
	}
	
	// Turn the rover 180 degrees 
	// Method to turn 180 degrees while maintaining no displacement 
	private static void turnAround(DCMotor lM, DCMotor rM) throws Exception 
	{
		// Update counter 
		counter = 23 - counter; 
    	
    	lM.setTargetVelocity(-1);
        rM.setTargetVelocity(1);

        Thread.sleep(710);
    	
        // Update turnCounter
    	turnCounter ++;
		
	}
	
	// Makes the rover stationary for  one second
	// Stop the rover from moving for one second
	private static void oneSecStop(DCMotor lM, DCMotor rM) throws Exception
	{
		lM.setTargetVelocity(0);
        rM.setTargetVelocity(0);

        Thread.sleep(1000);
		return;
	}
	
}


