
package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {

	public static void main(String[] args) {

		Robot rob = new Robot();

		// 1. Set the X position of the robot so that it starts on the left.

		rob.setSpeed(20);
		rob.penDown();
		rob.setX(20);

		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.

		for (int i = 0; i < 5; i++) {

			rob.move(50);
			rob.turn(144);

		}
		rob.penUp();
		rob.turn(-40);
		rob.move(-100);
		rob.penDown();

		for (int i = 0; i < 5; i++) {
			rob.move(70);
			rob.turn(144);

		}
		
		rob.penUp();
		rob.turn(-10);
		rob.move(-150);
		rob.penDown();
		for (int i = 0; i < 5; i++) {
			rob.move(100);
			rob.turn(144);

		}
		
		rob.penUp();
		rob.turn(-10);
		rob.move(-200);
		rob.penDown();
		for (int i = 0; i < 5; i++) {
			rob.move(120);
			rob.turn(144);

		}
		
		rob.penUp();
		rob.turn(-10);
		rob.move(-250);
		rob.penDown();
		for (int i = 0; i < 5; i++) {
			rob.move(140);
			rob.turn(144);

		}
		
	}

	// 3. Set the size of the star to 30.

	int starSize = 30;
}
