package Movement;

/*

Program: Movement.java          Last Date of this Revision: December 4, 2024

Purpose: An application that makes the rover move forward for 2 seconds then stops.

Author: William Merryfield
School: CHHS
Course: CSE3910 - Project D
 

*/

//Import Phidgets library
import com.phidget22.*;

public class LinearMovement {

	public static void main(String[] args) throws Exception {
	
		
		//Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);

        //Move forward at 50$ power
        leftMotors.setTargetVelocity(.5);
        rightMotors.setTargetVelocity(.5);

        //Wait for 2 seconds - Moves at above velocity for this amount of time before switching to the next velocity
        Thread.sleep(2000);

        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
	}

}
