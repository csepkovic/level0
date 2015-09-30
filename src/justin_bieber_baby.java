import java.io.IOException;

import javax.swing.JOptionPane;


public class justin_bieber_baby {

public static void main(String[] args) throws IOException, InterruptedException {
	for (int i = 1; i < 7; i++) {
			for (int j = 0; j < 3; j++) {
				Runtime.getRuntime().exec("say " + "Baby").waitFor();
			}
			if (i==1||i==4) {
			Runtime.getRuntime().exec("say " + "Oh").waitFor();
			}
			if (i==2||i==5) {
			Runtime.getRuntime().exec("say " + "No").waitFor();
			}
			if (i==3||i==6){
			Runtime.getRuntime().exec("say " + "I thought you'd always be mine, mine").waitFor();
			}
	}
}
}
