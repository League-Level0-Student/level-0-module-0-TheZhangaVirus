package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
		
	public static void main(String[] args) {

		Robot robot = new Robot("mini");
		
		robot.setSpeed(100);
	
		robot.setX(400);
		
		robot.setY(300);
	
		robot.penDown();
		
		robot.turn(20);
		
		robot.move(200);
		
		robot.turn(140);
	
		robot.move(200);
		
		robot.turn(180);
		
		robot.move(100);
		
		robot.turn(-70);
		
		robot.move(67);
		
		robot.penUp();
		
		robot.move(100);
	}
	
}
