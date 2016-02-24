package level0;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(userInput);
		if (age < 18) {
			JOptionPane.showMessageDialog(null, "Scram, kid.");
		} else {
			String pres = JOptionPane.showInputDialog("Who are you voting for?");
			if (pres.equalsIgnoreCase("Donald Trump")) {
				JOptionPane.showMessageDialog(null, "Wait, you're serious?");
			} else if (pres.equalsIgnoreCase("Hilary Clinton")) {
				JOptionPane.showMessageDialog(null, "You're 'Hilary'ous.");
			} else {
				JOptionPane.showMessageDialog(null, "Dude, I don't care");
				JOptionPane.showMessageDialog(null, "Wait, you thought this was a voting booth?");
				JOptionPane.showMessageDialog(null, "This is a lemonade stand.");
			}
		}
	}
}