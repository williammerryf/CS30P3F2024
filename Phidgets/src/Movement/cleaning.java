package Movement;
//Add Phidgets Library
import com.phidget22.*;
public class cleaning {

	public static void main(String[] args) throws Exception  
	{
		//Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);
        
        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();
        
        //Address
        leftMotors.setChannel(1);
        rightMotors.setChannel(0);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);
        
        while(true)
        {
        	leftMotors.setTargetVelocity(0.5);
            rightMotors.setTargetVelocity(0.5);

            
        }

	}

}
