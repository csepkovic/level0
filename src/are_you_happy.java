import javax.swing.JOptionPane;

public class are_you_happy {
public static void main(String[] args) {
	int userMood = JOptionPane.showOptionDialog(null, "Are you happy?", "idk", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No" }, null);
	if (userMood==0) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
	}
if (userMood==1) {
	int userWant =  JOptionPane.showOptionDialog(null, "Do you want to be happy?", "idk", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No" }, null);
	
	if (userWant==0){
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	if (userWant==1){
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
	}
	}
}
}
