package level0;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		/*
		 * Ask the user how many hours they spent coding this week.
		 *
		 * 1. If it's 3 or more, tell them they're a Code Ninja.
		 * 
		 * 2. If it's less than 2, tell them to stop watching YouTube and write
		 * code instead.
		 * 
		 * 3. If it's more than 5, play the Batman theme song.
		 */
		String userInput = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
		int codeLife = Integer.parseInt(userInput);
		if (codeLife < 2) {
			JOptionPane.showInputDialog("Then stop watching YouTube and go do some coding!");
			JOptionPane.showMessageDialog(null, "What, you thought the input box was there for a reason?");
			JOptionPane.showMessageDialog(null, "Nope!");
		}
		else if (codeLife > 2 && codeLife < 6) {
			JOptionPane.showMessageDialog(null, "Dude, you're a Code Ninja.");
		}
		else if (codeLife > 5) {
			playBatmanTheme();
		}
		else if (codeLife == 2) {
			JOptionPane.showMessageDialog(null, "I am indifferent towards your response...");
		}
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
