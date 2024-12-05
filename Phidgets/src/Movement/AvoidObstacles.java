package Movement;

/*

Program: AvoidObstacles.java          Last Date of this Revision: December 4, 2024

Purpose: An application that makes the rover move forward for and if an object is detected it will spin around and move in that direction instead.

Author: William Merryfield
School: CHHS
Course: CSE3910 - Project D
 

*/

// Import Phidgets Library
import com.phidget22.*;

public class AvoidObstacles 
{

	public static void main(String[] args) throws Exception
	{
		// Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        // Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        // Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        // Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);

        // Rover moves forward until it detects an object less than 200mm in front of it
        // If an object is detected the rover will turn 180 degrees and move in that direction
        while (true) 
        {
        	// Display detected distance
            System.out.println("Distance: " + sonar.getDistance() + " mm");
            
            if (sonar.getDistance() < 200) 
            {
                // Object detected! Stop motors
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
            } 
            else 
            {
                // Move forward slowly (25% max speed)
                leftMotors.setTargetVelocity(0.5);
                rightMotors.setTargetVelocity(0.5);
            }

            // Wait for 100 milliseconds
            Thread.sleep(100);
        }

	}
	
}
