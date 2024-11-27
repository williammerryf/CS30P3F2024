package Challenges;

//Add Phidgets Library
import com.phidget22.*;

public class Square {

	public static int counter = 0;
	
	public static void main(String[] args) throws Exception 
	{
		
		//int counter = 0;
		
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
        
        /*
        //Move forward at full speed
        leftMotors.setTargetVelocity(.5);
        rightMotors.setTargetVelocity(.5);
	
        //Wait for 2 seconds - Moves at velocity for this amount of time before switching to the next line of code, similar to while loop
        Thread.sleep(3333);
        
        //Turn in one direction
        leftMotors.setTargetVelocity(-1);
        rightMotors.setTargetVelocity(1);

        //Wait for 2 second
        Thread.sleep(590); // 90 degree turn roughly

        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
	
        //Move forward at full speed
        leftMotors.setTargetVelocity(.5);
        rightMotors.setTargetVelocity(.5);
	
        //Wait for 2 seconds - Moves at velocity for this amount of time before switching to the next line of code, similar to while loop
        Thread.sleep(3333);
        */
        
       // counter = 33;
       normDirection(leftMotors, rightMotors, sonar, counter);
  
        
        /*
        while (counter != 4) 
        {

            System.out.println("Distance: " + sonar.getDistance() + " mm");
            
            if (sonar.getDistance() < 200) 
            {
                //Object detected! Stop motors
                leftMotors.setTargetVelocity(-0.5);
                rightMotors.setTargetVelocity(-0.5);
            } 
            else 
            {
            	
            	leftMotors.setTargetVelocity(0.5);
                rightMotors.setTargetVelocity(0.5);
            	
                Thread.sleep(3333);
                
                //Turn in one direction
                leftMotors.setTargetVelocity(-1);
                rightMotors.setTargetVelocity(1);

                //Wait for 2 second
                Thread.sleep(590); // 90 degree turn roughly
                counter++;
            }
            Thread.sleep(100);
        }
        */
        
        
        /*
        while(counter != 4)
        {
        	if (sonar.getDistance() < 200) {
                //Object detected! Stop motors
                leftMotors.setTargetVelocity(-0.5);
                rightMotors.setTargetVelocity(-0.5);
                Thread.sleep(100);
            } else {
                //Move forward slowly (25% max speed)
                leftMotors.setTargetVelocity(0.5);
                rightMotors.setTargetVelocity(0.5);
                
            }
    	
            //Wait for 2 seconds - Moves at velocity for this amount of time before switching to the next line of code, similar to while loop
            Thread.sleep(3333);
            
            //Turn in one direction
            leftMotors.setTargetVelocity(-1);
            rightMotors.setTargetVelocity(1);

            //Wait for 2 second
            Thread.sleep(590); // 90 degree turn roughly
            
            counter ++;
            
            
            
        }
        */
	
	}

	// make a reverse direction version and keep track of counter so it can back track an even amount in case object is infront of it
	
	private static void normDirection(DCMotor lM, DCMotor rM,DistanceSensor s/*, int c instead of counter*/) throws Exception 
	{
        while(counter != 33) // fix dist travelled toa  meter its a lill over
        {
        	lM.setTargetVelocity(0.5);
            rM.setTargetVelocity(0.5);
            counter++;
            Thread.sleep(101);
            if (s.getDistance() < 200)
            {
            	break;
            }
        }
        
        if(counter == 33)
        {
        	//Turn in one direction
            lM.setTargetVelocity(-1);
            rM.setTargetVelocity(1);

            Thread.sleep(810); // 90 degree turn roughly
            
            lM.setTargetVelocity(0);
            rM.setTargetVelocity(0);

        }
        
        return;

	}
	
	
	// didnt test with counter variable here
	private static int revDirection(DCMotor lM, DCMotor rM,DistanceSensor s, int c) throws Exception 
	{
		while(c != 33) // fix dist travelled toa  meter its a lill over
        {
        	lM.setTargetVelocity(-0.5);
            rM.setTargetVelocity(-0.5);
        	c++;
            Thread.sleep(101);
            if (s.getDistance() < 200)
            {
            	break;
            }
        }
        
        if(c == 33)
        {
        	//Turn in one direction
            lM.setTargetVelocity(1);
            rM.setTargetVelocity(-1);

            Thread.sleep(810); // 90 degree turn roughly
            
            lM.setTargetVelocity(0);
            rM.setTargetVelocity(0);
            
            return 0;
        }
        else
        {
        	return c;
        }
	}
	
	private int getCounter()
	{
		return(counter);
	}
	
}


