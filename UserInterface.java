/**
 * Class Name: UserInterface
 *
 * Purpose: 
 * Organizes and controls data input for the game.
 *
 * Last Revision: 2016-01-06
 * 
 */

public class UserInterface
{

	public InputValidation offenseInput,
	   					   defenseInput;
	
	public UserInterface(InputValidation offenseInputObject, InputValidation defenseInputObject)
	{
		offenseInput = offenseInputObject;
		defenseInput = defenseInputObject;
		
	}//end PlayableCharacter constructor method
	
	/**
	 * Method Name: inputOffenseScore()
	 * 
	 * Purpose:
	 * An instance method that calls for the input validation method for the defense score
	 * and assigns the return value to the current instance
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public int inputOffenseScore()
	{
		return offenseInput.getValue();
		
	}// end void method inputOffenseScore
	
	/**
	 * Method Name: inputDefenseScore()
	 * 
	 * Purpose:
	 * An instance method that calls for the input validation method for the offense score
	 * and assigns the return value to the current instance
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: Nothing
	 * 
	 */
	
	public int inputDefenseScore()
	{
		return defenseInput.getValue();
		
	}// end void method inputDefenseScore
	
}//end class UserInterface
