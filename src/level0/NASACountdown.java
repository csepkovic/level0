package level0;

import javax.swing.JOptionPane;

public class NASACountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		// 3. convert the user's answer to an int (Integer.parseInt)

		// 4. countdown from user's starting point
		// 1. countdown from 10 to 0
		for (int i = 10; i >0; i--) {
			JOptionPane.showMessageDialog(null, i);
		}

		// 5. when the counting is done, print "blastoff!"
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


