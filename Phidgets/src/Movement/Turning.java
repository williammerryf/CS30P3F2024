package Movement;

/*

Program: Turning.java          Last Date of this Revision: December 4, 2024

Purpose: An application that makes the rover move forward for 1 second, turn around (180 degrees), and move forward (relative to the Phidget) for 1 second.

Author: William Merryfield
School: CHHS
Course: CSE3910 - Project D
 

*/

//Import Phidgets Library
import com.phidget22.*;

public class Turning 
{

	public static void main(String[] args) throws Exception 
	{
			
		// Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        // Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();

        // Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        // Open
        leftMotors.open(5000);
        rightMotors.open(5000);

        leftMotors.setTargetVelocity(0.5);
        rightMotors.setTargetVelocity(0.5);
        
        Thread.sleep(1000); // One second
        
        // Stop motors - velocity 0
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        Thread.sleep(1000); // One second
        
        // Turn in one direction
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);

        // Wait
        Thread.sleep(900); // Enough time for a 180 degree turn - roughly
        
        // Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        Thread.sleep(1000); // One second
        
        leftMotors.setTargetVelocity(0.5);
        rightMotors.setTargetVelocity(0.5);
        
        Thread.sleep(1000); // One second

	}

}
