package level0;
import java.net.URI;

import javax.swing.JOptionPane;

public class soundtrack_to_life {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "How are you feeling?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Stressed", "Sad", "Angry" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
				System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
				if (userMood==0) {
					playVideo("https://www.youtube.com/watch?v=qREKP9oijWI");
				}

		// 4. Play different songs for other moods.
				else if (userMood==1) {
					playVideo("https://www.youtube.com/watch?v=v95Q6cSGh08");
				}
				else if (userMood==2) {
					playVideo("https://www.youtube.com/watch?v=jI-kpVh6e1U");
				}
						// If you are seeing ads at the beginning of your videos, install Adblock.

}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


