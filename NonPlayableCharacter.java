/**
 * Class Name: NonPlayableCharacter
 *
 * Purpose: 
 * Extends the Character class to allow for control 
 * over the attributes input for a non player character
 * 
 * Last Revision: 2016-01-06
 * 
 */

public class NonPlayableCharacter extends Character
{
	
	public NonPlayableCharacter(String name)
	{
		nameCharacter(name);
	
	}// end NonPlayableCharacter constructor method
	
	
	/**
	 * Method Name: generateRandomScoreValue()
	 * 
	 * Purpose:
	 * A instance method that returns a random integer value within the 
	 * pre-set legal interval for the Character Class
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: One integer value
	 * 
	 */
	
	public int generateRandomScoreValue()
	{
		return CombatHandler.generateRandomNumber(Character.MIN_SCORE_VALUE, Character.MAX_SCORE_VALUE);
		
	}// end int returning method generateRandomScoreValue()
	
	
	/**
	 * Method Name: getScoreValues()
	 * 
	 * Purpose:
	 * An instance method that sets the Score Values of the character instance
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public void getScoreValues()
	{
		offenseScore = generateRandomScoreValue();
		defenseScore = generateRandomScoreValue();

	}// end void method getScoreValues
	
}//end NonPlayableCharacter class
