package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		Robot Echo = new Robot();		
Echo.setPenWidth(100);
		Echo.setSpeed(200);
		Echo.penDown();
		for(int i = 0; i < 4; i++) {
			Echo.move(250);
		Echo.turn(90);
		}
		
	}
	
}
