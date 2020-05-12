package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method

	public static void main(String[] args) {
		boolean winner = false;

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int x = 0; x < 5; x++) {
			robots[x] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int y = 0; y < 5; y++) {
			robots[y].setY(500);
			robots[y].setX((y * 100) + 100);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();
		for (int z = 0; z < 5; z++) {
			robots[z].move(rand.nextInt(500));
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		while (winner == false) {
			for (int a = 0; a < 5; a++) {
				robots[a].move(rand.nextInt(50));
				if (robots[a].getY() <= 0) {
					System.out.println("Robot " + a + " is the winner!");
					winner = true;
				}
			}

		}
	}
	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

}
