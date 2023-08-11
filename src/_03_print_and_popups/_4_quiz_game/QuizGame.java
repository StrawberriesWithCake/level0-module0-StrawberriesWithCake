package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String input = JOptionPane.showInputDialog(null,"What season did homer smuggle a snake? ");
		if (input.equals("Season 27")) {
		score +=1; }
		else {score -=1;
		
		}
		String input2 = JOptionPane.showInputDialog(null,"In the episode \"Portrait of a Lackey on Fire\",\n Who was the main character?");
		if (input2.equals("Mr. Smithers")) {
			score +=1; 
		} else {
			score -=1;
		}
	
		String input3 = JOptionPane.showInputDialog(null,"What did homer write on Lisa's birthday cake in \"Mr. Lisa's Opus\"?");
		if (input3.equals("Happy 12th Birthday")) {
			score +=1;
		} else {
			score -=1;
		}
		String input4 = JOptionPane.showInputDialog(null,"How many seasons are in the simpsons? ");
		if (input4.equals("34")) {
			score +=1;
		} else {
			score -=1;
		}
		String input5 = JOptionPane.showInputDialog(null,"How many times have Homer and Marge remarried? ");
		if (input.equals("three times")) {
			score +=1;
		} else {
			score -=1;
		}
		}
		}
	}
	
	
		// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	

