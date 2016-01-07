/**
 * Class Name: InputValidation
 *
 * Purpose: 
 * Blueprint for a standard value range input validation loop.
 * Requires the following 4 parameters: 
 * 1 - The scanner object it will read the input from
 * 2 - The initial prompt to be displayed to the user
 * 3 - The minimum accepted value
 * 4 - The maximum accepted value
 * 
 * Last Revision: 2016-01-06
 * 
 */

import java.util.Scanner;

public class InputValidation
{
	public String promptMessage,
		   		  errorMessage;
	
	public int minValue,
		       maxValue;
	
	Scanner scannerObject;
	
	public InputValidation(Scanner scannerObject, String promptString, int minValue , int maxValue)
	{
		
		this.scannerObject = scannerObject;
		promptMessage = promptString;
		this.minValue = minValue;
		this.maxValue = maxValue;
		
		errorMessage = "\nInvalid Input - Please enter a value from "
				+ minValue + " to " + maxValue + ".\n";
		
	}// end InputValidation constructor method

	/**
	 * Method Name: getValue()
	 * 
	 * Purpose:
	 * An instance method that prompts the user for a value within the acceptable range (defined as
	 * attributes for the instance of the object) and only returns a validated result
	 * 
	 * Accepts: Nothing
	 * 
	 * Returns: A validated int value.
	 * 
	 */
	
	public int getValue()
	{
		boolean isInputValid = false;
		int userInput;
		
		do
		{
			System.out.print(promptMessage);
			userInput = scannerObject.nextInt();
			scannerObject.nextLine(); // Buffer Flush

			if (userInput >= minValue && userInput <= maxValue)
			{
				isInputValid = true;
				
			}// end if: User input is within the accepted range

			else
			{
				System.out.println(errorMessage);

			}// end else: User input is invalid

		}while (!isInputValid); // end while loop
		
		return userInput;
		
	}// end int returning method getValue()	
	
}//end class InputValidation
