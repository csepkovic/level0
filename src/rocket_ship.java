import javax.swing.JOptionPane;


public class rocket_ship {
 public static void main(String[] args) {
	int blastoff= 10;
	for (int i = 0; i < 10; i++) {
		JOptionPane.showMessageDialog(null, blastoff);
		blastoff= blastoff-1;
		if (blastoff==0) {
			JOptionPane.showMessageDialog(null, "BLASTOFF!!!");
		}
	}
}
}
