/**
 * Class Name: CombatHandler
 *
 * Purpose: 
 * Processes combat calculations
 * 
 * Last Revision: 2016-01-06
 * 
 */

public class CombatHandler
{
	public PlayableCharacter player;
	public NonPlayableCharacter enemy;
	
	public CombatHandler(PlayableCharacter playerCharacter, NonPlayableCharacter enemyCharacter)
	{
		player = playerCharacter;
		enemy = enemyCharacter;
		
	}// end CombatHandler constructor method
	
	/**
	 * Method Name: didAttackHit()
	 * 
	 * Purpose:
	 * A static methods that calculates the success of an attempted hit from one character using
	 * his current To-Hit Score
	 * 
	 * Accepts: Two Character objects
	 * 
	 * Returns: A boolean value
	 * 
	 */
	
	public static boolean didAttackHit(Character attackingCharacter, Character defendingCharacter)
	{
		return generateRandomNumber(Character.MIN_SCORE_VALUE, (Character.MAX_SCORE_VALUE -1) ) < attackingCharacter.toHitScore;

	}// end boolean returning method didAttackHit
	
	/**
	 * Method Name: generateRandomNumber()
	 * 
	 * Purpose:
	 * A static method that returns a random integer between and including two numbers.
	 * 
	 * Accepts: two integer values
	 * 
	 * Returns: one integer value 
	 * 
	 */
	
	public static int generateRandomNumber(int lowestValue, int highestValue)
	{
		int valueIntervalLength = highestValue - lowestValue + 1;	
		return (int)(Math.random()*valueIntervalLength) + lowestValue;
		
	}// end int returning static method: generateRandomNumber()

	/**
	 * Method Name: attack()
	 * 
	 * Purpose:
	 * A static method that checks for a sucessful attack from one character into another,
	 * calculates the wound suffered by the defending character and informs the player
	 * about the result.
	 * 
	 * Accepts: Two character objects
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public static void attack(Character attackingCharacter, Character defendingCharacter)
	{	
		if (didAttackHit(attackingCharacter, defendingCharacter))
		{
			defendingCharacter.isWounded = true;
			System.out.println(attackingCharacter.firstUpperName + " lethaly wounded " + defendingCharacter.allLowerName);
		
		}// end if: The attack was sucessful
		
		else
		{
			System.out.println(attackingCharacter.firstUpperName + " missed " + defendingCharacter.allLowerName);
			
		}// end else: the attack missed
		
	}// end void method attack
	
	/**
	 * Method Name: areBothOutOfStamina()
	 * 
	 * Purpose:
	 * An instance method that checks if both characters are out of stamina
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: A boolean
	 * 
	 */
	
	public boolean areBothOutOfStamina()
	{
		return (player.stamina <= 0 && enemy.stamina <= 0);
	
	}// end boolean returning method areBothOutOfStamina
	
	/**
	 * Method Name: getScoreValues()
	 * 
	 * Purpose:
	 * An instance method that gets the Score Values for both characters engaged in combat
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public void getScoreValues()
	{	
		/** Enemy Score Inputs **/
		
		if (enemy.stamina > 0)
		{
			enemy.getScoreValues();
			
		}// end if: The enemy character still has enough stamina to act
		
		else
		{
			// Enemy Cannot Act
			System.out.println("The enemy is out of stamina!\n");
			enemy.assignMinScores();
			
		}// end else: the enemy is out of Stamina		
		
	
		/** Player Score Inputs **/
		
		if (player.stamina > 0)
		{	
			player.getScoreValues();

		}// end if: The player still has enough stamina to act

		else
		{
			System.out.println("You are out of Stamina!\n");
			player.assignMinScores();

		}// end else: The player has no Stamina left to act

	}// end void method getScoreValues()
	
	/**
	 * Method Name: printScoreValues()
	 * 
	 * Purpose:
	 * An instance method that prints out the current score values of both characters.
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public void printScoreValues()
	{
		System.out.println("\nPlayer: " + player.offenseScore + " / " + player.defenseScore);
		System.out.println("Enemy: " + enemy.offenseScore + " / " + enemy.defenseScore + "\n");
	
	}// end void method printScoreValues
	
	/**
	 * Method Name: consumeStamina()
	 * 
	 * Purpose:
	 * A static method that adjusts the stamina values of each character according the currenct action costs.
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public void consumeStamina()
	{
		player.consumeCurrentActionStamina();
		enemy.consumeCurrentActionStamina();
	
	}// end void method consumeStamina
	
	/**
	 * Method Name: calcToHitScores()
	 * 
	 * Purpose:
	 * An instance method that calculates the To-Hit Scores of each character for the turn
	 * 
	 * Accepts: one Character object and one Enemy object
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public void calcToHitScores()
	{
		player.toHitScore = (player.offenseScore - enemy.defenseScore); 
		enemy.toHitScore = (enemy.offenseScore - player.defenseScore);
	
	}// end void method calcToHitScores
		
	/**
	 * Method Name: executeTurn()
	 * 
	 * Purpose:
	 * An instance method that fully executes one turn of combat
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public void executeTurn()
	{
		// Step 1 - The score values for the actions of each character are chosen.
		getScoreValues();
		
		// Step 2 - Both characters' score values are revealed. 
		printScoreValues();
		
		// Step 3 - Both characters have their To-Hit Scores calculated and their stamina reduced by the action cost on that turn.
		calcToHitScores();
		consumeStamina();
		
		// Step 4 - The offense scores of each character's actions are compared. 
		
		if (player.offenseScore == enemy.defenseScore)
		{
			// If the characters actions share the same offense score, 
			// then both are considered to be attacking at the same time 
			// and their to-hit scores will be checked independently.
			
			attack(enemy, player);
			attack(player, enemy);
			
		}// end if: Both characters have the same Offense Score	
		
		else
		{		
			
			// Otherwise, the character with the highest offense score is considered to be attacking first. 
			// That character to-hit score will be checked first. If and only if the attack is not sucessful, 
			// the to-hit score of the character with the lowest offense score will then be checked for sucess.
				
			Character highOffScoreChar = enemy,
					  lowOffScoreChar = player;

			if (player.offenseScore > enemy.defenseScore)
			{
				highOffScoreChar = player;
				lowOffScoreChar = enemy;

			}// end if: The player character actually has the highest Offense Score
			
			attack(highOffScoreChar,lowOffScoreChar);
			
			if (! lowOffScoreChar.isWounded )
			{
				attack(lowOffScoreChar,highOffScoreChar);
				
			}// end if: the highest offense score character did NOT wound the defending character
			
		}// end if: The characters have different Offense Scores
		
	}// end void method executeTurn
		
}//end CombatHandler class
