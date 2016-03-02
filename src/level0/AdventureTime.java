package level0;

import javax.swing.JOptionPane;

public class AdventureTime {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"You wake up to a beautiful and sunny day outside with the birds chirping and the flowers blooming...");
		int userChoice1 = JOptionPane.showOptionDialog(null, "What do you do?", "It's obvious", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "You go back to sleep.", "You get up and go into the kitchen." }, null);
		if (userChoice1 == 0) {
			JOptionPane.showMessageDialog(null, "You had a very boring day...");
		} else if (userChoice1 == 1) {
			JOptionPane.showMessageDialog(null,
					"You walk into the kitchen with a craving of either eggs, cereal, or a cinnamon roll...");
			int userChoice2 = JOptionPane.showOptionDialog(null, "What do you do?", "Stay healthy!", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Eat the eggs.", "Eat the cereal.", "Eat the cinnamon roll." }, null);
			JOptionPane.showMessageDialog(null, "You eat your breakfast and start your walk to work.");
			JOptionPane.showMessageDialog(null,
					"On your way you can hear very faint footsteps that seem to be tailing you...");
			int userChoice3 = JOptionPane.showOptionDialog(null, "What do you do?",
					"I suggest you keep 'er goin'. I mean, being stalked is really no biggy, right?", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Try to lose them down an alley.", "Just keep walking." }, null);
			if (userChoice3 == 1) {
				JOptionPane.showMessageDialog(null,
						"Later on your walk, you are pushed down to the ground and knocked out.");
				JOptionPane.showMessageDialog(null,
						"You wake up to 3 guys running away and your wallet missing from your pocket.");
				JOptionPane.showMessageDialog(null, "Stalking is no small matter, smart one.");
			} else if (userChoice3 == 0) {
				JOptionPane.showMessageDialog(null,
						"You see an alley to your left and just when you get close enough, you bolt.");
				if (userChoice2 == 2) {
					JOptionPane.showMessageDialog(null,
							"You feel so out of breath from just taking one step that you trip immediately.");
					JOptionPane.showMessageDialog(null,
							"You turn around to see 3 guys getting ready to beat you to the pulp.");
					JOptionPane.showMessageDialog(null, "Should've stayed healthy!");
				} else {
					JOptionPane.showMessageDialog(null, "You run down the alley to be stop by a two way intersection; it's either left or right...");
					int userChoice4 = JOptionPane.showOptionDialog(null, "What do you do?", "Left. You always go left. Duh.", 0,
							JOptionPane.INFORMATION_MESSAGE, null,
							new String[] {"Go left.", "Go right." }, null);
					if (userChoice4 == 0){
						JOptionPane.showMessageDialog(null, "Dead end.");
						JOptionPane.showMessageDialog(null, "Nice one, dingus.");
					}
					else if (userChoice4 == 1){
						
					}
				}
			}
		}
	}
}
