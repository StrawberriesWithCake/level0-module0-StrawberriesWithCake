package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String input= JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null,"You have been chosen to string chaos all over planet earth."+input);
		}
		// 3. Otherwise, tell them to sign up for classes at The League.
		if (input.equals("no")) {
			JOptionPane.showMessageDialog(null,"Instead of using your parents' money for robux,\n"
					+ "Use it to go learn something for once at The League of Amazing Programmers."+input);
		}
	}
}

