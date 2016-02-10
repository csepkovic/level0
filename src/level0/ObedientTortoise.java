package level0;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		String shape = JOptionPane.showInputDialog("What shape do you want? (square, triangle, circle)");
		String color = JOptionPane.showInputDialog("What color do you want? (red, yellow, blue)");
		if (color.equals("red")) {
			Tortoise.setPenColor(Color.red);
		} else if (color.equals("yellow")) {
			Tortoise.setPenColor(Color.yellow);
		} else if (color.equals("blue")) {
			Tortoise.setPenColor(Color.blue);
		} else {
			Tortoise.setPenColor(Color.black);
		}
		if (shape.equals("square")) {
			tortoiseSquare(200);
		} else if (shape.equals("triangle")) {
			tortoiseTriangle(200);
		} else if (shape.equals("circle")) {
			tortoiseCirlce(2);
		} else {
			JOptionPane.showMessageDialog(null, "Dingus");
		}
	}

	private static void tortoiseCirlce(int size) {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(size);
			Tortoise.turn(1);
		}
	}

	private static void tortoiseTriangle(int size) {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(size);
			Tortoise.turn(120);
		}
	}

	private static void tortoiseSquare(int size) {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(size);
			Tortoise.turn(90);
		}
	}
}
