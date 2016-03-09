//Imported Classes from lejos
import lejos.util.Delay;
/**
import lejos.nxt.Motor;
import lejos.robotics.ColorDetector;
import lejos.nxt.SensorPort;
import lejos.nxt.ColorSensor;
import lejos.robotics.Color;
**/

public class Level1 {
	robot robot1 = new robot();
	String[] robot1 = {blue, red, green};
	
	public static void main (String[] args) {
		Level1 level = new Level1();
		
		 		
	}
	
	
	public void turnRight(){
		BeastEngine.rotateRight();
		Delay.msDelay(500);
	}
	public void turnLeft(){
		BeastEngine.rotateLeft();
		Delay.msDelay(10000);
	}
	public void goForward(){
		BeastEngine.MotorMoveForward();
		Delay.msDelay(1500);
	}
	
	public void findBall(){
		for(;;)
        {
            		if (robotBobby.checkLight(1) == false)
            		{
                  //put instructions here for actions
                    //to be carried out if no line is
                         //detected
            		 }

                    if (robotBobby.checkLight(1)==true)
                     {
                            //put instructions here for actions
                                //to be carried out when a line is
                                   //detected for the first time
                     while(robotBobby.checkLight(1)==false)
                     {
                           //put instructions here for actions
                             //to be carried out when a line is
                                //not detected after the first line
                                      //has been
                    }
                    if (robotBobby.checkLight(1)==true){
                          //put instructions here for actions
                            //to be carried out when a line is
                                //detected for a second time
                    }
                     }
        }
	}
}

              
        


	
	