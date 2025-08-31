package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		
		@override
		public void drawSquare() {
			rob.move(20);
			rob.turn(90);
			rob.move(20);
			rob.turn(90);
			rob.move(20);
			rob.turn(90);
			rob.move(20);
		}
	}

}
