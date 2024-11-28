package Challenges;

//Add Phidgets Library
import com.phidget22.*;

public class Square {

	public static int counter = 0;
	public static int turnCounter = 0;
	
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
        
        int x = 0;
        
        
        //overrotates when more than 1 turn ex going to two sides of a square
        // prolly due to wheel accel
        // change turn or make it stop
        
        
        while(x != 2)
        {     	

        	if (turnCounter % 2 == 0)
        	{
        		normDirection(leftMotors, rightMotors, sonar);
        		turnAround(leftMotors, rightMotors, sonar);
        	}
        	else
        	{
        		revDirection(leftMotors, rightMotors, sonar);
        		turnAround(leftMotors, rightMotors, sonar);
        	}
        	
        	oneSecStop(leftMotors, rightMotors);
       	
        	x++;
            
            Thread.sleep(100);
        }

	 }

	// make a reverse direction version and keep track of counter so it can back track an even amount in case object is infront of it
	
	private static void normDirection(DCMotor lM, DCMotor rM, DistanceSensor s) throws Exception 
	{
        while(counter != 23) // abt a meter
        {
        	lM.setTargetVelocity(0.5);
            rM.setTargetVelocity(0.5);
            counter++;
            Thread.sleep(100);
            
            if (s.getDistance() < 200)
            {
            	break;
            }
        }
        
        if(counter == 23)
        {
        	//Turn in one direction
            lM.setTargetVelocity(-0.8);
            rM.setTargetVelocity(1);

            Thread.sleep(810); // 90 degree turn roughly
            /*
            lM.setTargetVelocity(0);
            rM.setTargetVelocity(0);
            Thread.sleep(1000);
            */
            counter = 0;

        }

        lM.setTargetVelocity(0);
        rM.setTargetVelocity(0);
        Thread.sleep(1000);
        
        return;

	}
	
	private static void revDirection(DCMotor lM, DCMotor rM, DistanceSensor s) throws Exception 
	{
        while(counter != 23) // abt a meter
        {
        	lM.setTargetVelocity(0.5);
            rM.setTargetVelocity(0.5);
            counter++;
            Thread.sleep(100);
            
            if (s.getDistance() < 200)
            {
            	break;
            }
        }
        
        if(counter == 23)
        {
        	//Turn in one direction
            lM.setTargetVelocity(1);
            rM.setTargetVelocity(-0.8);

            Thread.sleep(810); // 90 degree turn roughly
            /*
            lM.setTargetVelocity(0);
            rM.setTargetVelocity(0);
            Thread.sleep(1000);
            */
            counter = 0;

        }
                
        return;

	}
	
	private static void turnAround(DCMotor lM, DCMotor rM, DistanceSensor s) throws Exception 
	{
		if (s.getDistance() < 200) 
        {
        	counter = 23 - counter; 
        	
        	lM.setTargetVelocity(-1);
            rM.setTargetVelocity(1);

            Thread.sleep(1200);
        	
        	turnCounter ++;
        } 
		else
		{
			return;
		}
	}
	
	private static void oneSecStop(DCMotor lM, DCMotor rM) throws Exception
	{
		lM.setTargetVelocity(0);
        rM.setTargetVelocity(0);

        Thread.sleep(100);
		return;
	}
	
}


