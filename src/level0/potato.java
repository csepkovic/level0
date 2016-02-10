package level0;
import java.io.IOException;



public class potato {
	public static void main(String[] args) throws IOException, InterruptedException {
		for (int i = 1; i < 9; i++) {
			if (i==4) {
				System.out.println(i);
				Runtime.getRuntime().exec("say " + i).waitFor();
			} else if (i==8) {
				System.out.println("more");
				Runtime.getRuntime().exec("say " + "more").waitFor();
			} else {
				System.out.println(i + " Potato");
				Runtime.getRuntime().exec("say " + i + "Potato").waitFor();
			}
			
		}
	}
	
}
