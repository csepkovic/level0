package level0;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String sHeight = JOptionPane.showInputDialog("How tall are you in feet?");
	int height = Integer.parseInt(sHeight);
	if (height < 4) {
		JOptionPane.showMessageDialog(null, "Scram, kid.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Enjoy the ride!");
	}
}
}
