package level0;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/**
 * Note: You will need the latest version of the TKP jar:
 * http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar
 **/

public class TurtleTreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 5;

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.move(5);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.move(-5);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
		Tortoise.setAngle(270);
		Tortoise.move(5);
		Tortoise.setAngle(0);
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(5);
		Tortoise.setAngle(0);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
		System.out.println(tortoiseLocationX);
		System.out.println(tortoiseLocationY);
		// 6. If tortoise is at same location as the little girl,
		// 			make a pop-up tell the Tortoise where to go next
		if (tortoiseLocationX > 490 && tortoiseLocationX < 520 && tortoiseLocationY > 280 && tortoiseLocationY < 355) {
			JOptionPane.showMessageDialog(null, "Ask the parrot, the robot pirate, and the swamp. Yes, the swamp.");
			JOptionPane.showMessageDialog(null, "They may not be able to tell you were to go, but they'll give you hints.");
		}
		if (tortoiseLocationX > 395 && tortoiseLocationX < 440 && tortoiseLocationY > 240 && tortoiseLocationY < 335) {
			JOptionPane.showMessageDialog(null, "-- -- --- e K*P y 1 y T b !S l -- --- Y sk &T l");
			JOptionPane.showMessageDialog(null, "Only some of his dialogue was understandable, but I think I've got what he did say.");
			JOptionPane.showMessageDialog(null, "e---y -y-b--l sk--l");
		}
		if (tortoiseLocationX > 400 && tortoiseLocationX < 465 && tortoiseLocationY > 80 && tortoiseLocationY < 120) {
			JOptionPane.showMessageDialog(null, "SQUAK emt SQUAK e SQUAK e SQUAK al SQUAK ul SQUAK");
			JOptionPane.showMessageDialog(null, "Only some of the dialogue was understandable, but I think I've got what they did say");
			JOptionPane.showMessageDialog(null, "-empt-e-e-al-ul-");
		}
		if (tortoiseLocationX > 150 && tortoiseLocationX < 450 && tortoiseLocationY > 370){
			JOptionPane.showMessageDialog(null, "Go to the ----- ------- in the -----");
			JOptionPane.showMessageDialog(null, "Well that was usefull.");
		}
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)

		
	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want,
		 * and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground(
				"file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null,
				"Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}
}
