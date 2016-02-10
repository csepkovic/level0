package level0;


//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
* Airline registration 
* 
* You are writing a program for a new airline to take their registration information at the check-in counter
* and print their boarding pass. You need to collect the following information: 
* 		First name 
* 		Last name
* 		Destination airport 
* 		Birthday (for security purposes) 
* 		Male/female (for security purposes) 
* 
* Print the boarding pass in this format:
* LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
* Traveling to: DESTINATION
* 
* Toolbox: main() method, JOptionPane.showInputDialog, variables
* 
**/
public class airline_registration {
	public static void main(String[] args) {
		String name= JOptionPane.showInputDialog("First Name");
		String last= JOptionPane.showInputDialog("Last Name");
		String destination= JOptionPane.showInputDialog("Destination Airport");
		String bday= JOptionPane.showInputDialog("Birthday (for security purposes)");
		String gender= JOptionPane.showInputDialog("Male/Female");
		JOptionPane.showMessageDialog(null, last+"/"+name+"("+bday+", "+gender+") \n"+"Travelling to:"+destination);
		System.out.println(last+ name+"("+bday+gender+")");
		System.out.println("Travelling to: "+ destination);
	}
}



