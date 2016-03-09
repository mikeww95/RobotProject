import lejos.nxt.Motor;
import lejos.util.Delay;
/**
import lejos.robotics.ColorDetector;
import lejos.nxt.SensorPort;
import lejos.nxt.ColorSensor;
import lejos.robotics.Color;
**/

public class robotBobby {
	
	public static void moveForward(){
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public static void moveBackwards(){
		Motor.A.backward();
		Motor.B.backward();
	}
	
	public static void moveLeft(){
		Motor.A.forward();
		Motor.B.backward();
	}
	
	public static void moveRight(){
		Motor.B.forward(); 
		Motor.A.backward();
	}
	
	public static void motorStop(){
		Motor.A.stop();
		Motor.B.stop();
	}
	
	public void speak(){			
		Delay.msDelay(500);
		System.out.println("Watch This");
	}

}
