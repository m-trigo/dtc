/**
 * Class Name: Character
 * 
 * Purpose:
 * Holds and manipulates the varaibles for the player and enemy characters
 * 
 * Last Revision: 2016-01-06
 * 
 */

public class Character
{
	final static int MIN_SCORE_VALUE = 0,
	         		 MAX_SCORE_VALUE = 5,
	         		 MAX_STAMINA = 20;
	
	public int maxStamina = MAX_STAMINA, 
			   stamina = maxStamina,
			   offenseScore = 0,
			   defenseScore = 0,
			   toHitScore = 0;
	
	public boolean isWounded = false;
	
	public String allLowerName,
				  firstUpperName;
	
	public void nameCharacter(String name)
	{
		allLowerName = name.toLowerCase();
		firstUpperName = String.valueOf(allLowerName.charAt(0)).toUpperCase() + allLowerName.substring(1);
			
	}// end void method nameCharacter
	
	/**
	 * Method Name: consumeCurrentActionStamina()
	 * 
	 * Purpose:
	 * An instance method that adjusts the current stamina value based on the
	 * current action's Score Values
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public void consumeCurrentActionStamina()
	{
		stamina -= (offenseScore + defenseScore);
		
	}// end void method consumeCurrentActionStamina
	
	/**
	 * Method Name: setStaminaToMax()
	 * 
	 * Purpose:
	 * An instance method that sets the current stamina value back to the max value
	 * of the character
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public void setStaminaToMax()
	{
		stamina = maxStamina;
		
	}// end void method setStaminaToMax	
	
	/**
	 * Method Name: assignMinScores()
	 * 
	 * Purpose:
	 * An instance method that assigns the minimum score value possible to the character
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public void assignMinScores()
	{
		offenseScore = MIN_SCORE_VALUE;
		defenseScore = MIN_SCORE_VALUE;
		
	}// end void method assignMinScores
	
}//end Character class
