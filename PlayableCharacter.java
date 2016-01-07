/**
 * Class Name: PlayableCharacter
 *
 * Purpose: 
 * Extends the Character class to allow for control 
 * over the data input for a playable character
 *
 * Last Revision: 2016-01-06
 * 
 */

public class PlayableCharacter extends Character
{
	
	public UserInterface interfaceObj;
	
	public PlayableCharacter(String name, UserInterface interfaceObject)
	{
		interfaceObj = interfaceObject;
		nameCharacter(name);
			
	}//end PlayableCharacter constructor method
	
	/**
	 * Method Name: getScoreValues
	 * 
	 * Purpose:
	 * An instance method that asks the interface object for
	 * invalid inputs to assign as score values and then assigns 
	 * them once returned.
	 * 
	 */
	
	public void getScoreValues()
	{
		offenseScore = interfaceObj.inputOffenseScore();
		defenseScore = interfaceObj.inputDefenseScore();

	}// end void method assignScoreValues
	
	
}//end class PlayableCharacter
