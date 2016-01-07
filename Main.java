/**
 * Program Name: Main.java
 *
 * Purpose: 
 * A program that runs a simple game with the pre-defined ruleset (ver. 1.1.0a)
 * https://github.com/sildurend/DTC/blob/1.1.0a/README.md
 * 
 * Coded By: Trigo, Murilo
 *
 * Creation Date: Dec 25, 2015 
 * 
 * Last Revision Date: 2016-01-06
 * 
 */

import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		
		/*****************
		   Setup Section
		 *****************/
		
		// Game Variables		
		Scanner input = new Scanner(System.in); // Scanner Object - Data Input
			
		// Console Line Interface Assets
		String screenBreak = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
			   offenseScoreInputPrompt = "Offense Score for the turn: ",
			   defenseScoreInputPrompt = "Defense Score for the turn: ";
		
		// Player Input Validation Objects
		InputValidation offenseScoreValidation = new InputValidation(input, offenseScoreInputPrompt, 
															Character.MIN_SCORE_VALUE, Character.MAX_SCORE_VALUE);
		InputValidation defenseScoreValidation = new InputValidation(input, defenseScoreInputPrompt, 
															Character.MIN_SCORE_VALUE, Character.MAX_SCORE_VALUE);
		
		UserInterface playerControl = new UserInterface(offenseScoreValidation , defenseScoreValidation);
		
		// Player Object
		PlayableCharacter player = new PlayableCharacter("You" , playerControl);
		
		// Enemy Object
		NonPlayableCharacter enemy = new NonPlayableCharacter("the enemy");
		
		// CombatHandler Object
		CombatHandler combatHandler = new CombatHandler(player, enemy);
		
		/**************************
		   Pre-Input Instructions
		 **************************/
		
		System.out.println(screenBreak);
		System.out.println("\t\tDefend The City - ver. 1.0.2a\n");
		
		
		/******************
		   Main Game Loop
		 ******************/

		boolean isGameOver = false;
		
		while ( !isGameOver )
		{
			combatHandler.executeTurn();
			
			// End-Game Checks
			if (player.isWounded && enemy.isWounded )
			{
				System.out.println(screenBreak + "\nBoth you and the enemy died!");
				isGameOver = true;
			}
			
			else if (player.isWounded)
			{
				System.out.println(screenBreak + "\nYou died.");
				isGameOver = true;
			}
			
			else if (enemy.isWounded)
			{
				System.out.println(screenBreak + "\nYou survived.");
				isGameOver = true;
			}
			
			else if (combatHandler.areBothOutOfStamina())
			{
				System.out.println(screenBreak + "\nBoth characters are out of stamina!");
				isGameOver = true;
			}			
			
			System.out.println(screenBreak);
		}
				
		/*************
		   Post-Game 
		 *************/
		
		input.close(); // Scanner Object clean-up
		
	}//end main method
	
}//end Main class
