//Imported Class from lejos
import lejos.nxt.Motor;
/**
import lejos.robotics.ColorDetector;
import lejos.nxt.SensorPort;
import lejos.nxt.ColorSensor;
import lejos.robotics.Color;
**/
public class BeastEngine {
	//Movement Related Functions
	//Backward and Forward are used oppositely due to how the Motors were mounted to the Robot
	public static void MotorMoveForward() {
		Motor.A.forward();
		Motor.B.forward();
	}
	public static void MotorMoveBackward(){
		Motor.A.backward();
		Motor.B.backward();
	}
	//Stops both Motors
	public static void MotorStop(){
		Motor.A.stop();
		Motor.B.stop();
	}
	//Sets the Speed of each Motor by passing two integers
	public static void setSpeed (int MotorASpeed, int MotorBSpeed){
		Motor.A.setSpeed(MotorASpeed);
		Motor.B.setSpeed(MotorBSpeed);
	}

	//Turning Related Functions
	public static void rotateLeft(){
		Motor.A.forward();
		Motor.B.backward();
	}
	public static void rotateRight(){
		Motor.B.forward(); 
		Motor.A.backward();
	}
	/** //Chomp Function for securing the ball
	public static void Chomp(int angle){s
		Motor.C.rotate(angle, true);
	}
	**/
	//Lifting Function for lifting the pen
	public static void lift(int angle){
		Motor.C.rotate(angle, true);
	}
}

