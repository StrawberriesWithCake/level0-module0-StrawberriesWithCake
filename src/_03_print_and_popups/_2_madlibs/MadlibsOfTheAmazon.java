package _03_print_and_popups._2_madlibs;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  "If you find yourself having to cross a piranha-infested river, here's how to do it...";
		
		// Get the player to enter a name
		String Name1 = JOptionPane.showInputDialog("Enter a name");
		// Get the player to enter an adjective
		String Adjective1 = JOptionPane.showInputDialog("Enter an adjective");
		// Get the player to enter an adjective
		String Adjective2 = JOptionPane.showInputDialog("Enter an adjective");
		// Get the player to enter a name
		String Name2 = JOptionPane.showInputDialog("Enter a name");
		// Get the player to enter an emotion
		String Emotion = JOptionPane.showInputDialog("Enter a type of happy emotion");
		// get the player to enter a name
		String Name3 = JOptionPane.showInputDialog("Enter a name"); 
		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered by the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		
		String story = 
		"In Alabama, there was a popular restaurant. There was a cook named " + Name1 + ".\n" +
		"They were quite " + Adjective1 + " and served the most " + Adjective2 + " dishes.\n" +
		"After working there as the executive chef for almost 9 years, a new sous chef was hired.\n"+
		"" + Name2 + " was " + Emotion + ", till he got stabbed in the back.\n" +
		"The sous chef, " + Name3 + " became envious of the executive chef for hogging credit.\n"+
		"In the fall, a well-known food critic stumbled upon the restaurant.\n"+
		"The food critic asked for a custom dish, compliments from the chef.\n"+
		"The sous chef poured mercury into the critic's soup. He fumbled anxiously.\n"+
		"The bowl was placed in front of the critic. Within one spoonful of soup,\n"+
		"The critic started vomiting blood! Everyone just filmed the critic slowly dying in agony,\n"+
		"instead of calling emergency services.\n"+
		"The executive chef stared at the critic from the kitchen window, with a ghastly expression.\n"+
		"The police arrested the executive chef, and he was sent away.\n"+
		"In prison, his life turned upside down, sneaking drinks to take away his sorrow.\n"+
		"The video of the dying critic became viral because most people like to see suffering.\n";
		
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		JOptionPane.showMessageDialog(null, story);
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

	}
}