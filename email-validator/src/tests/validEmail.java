package tests;
public class validEmail {
	
	//Method to check for the two specified rules in 3-1
	public static int validate(String address){
		//Integer to count the number of rules address has passed
		int rulesPassed = 0;
		//First check if an @ exists in the String
		if(address.indexOf("@") != -1){
			//Check if there DOESN'T exist another @ in the String
			if(address.indexOf("@", address.indexOf("@") + 1) == -1)
				//One @ only exists, increment the # of rules passed by 1
				rulesPassed++;
		}
		//Simply check if a . has an index position in the String
		//This means at least one . is present in the String
		if(address.indexOf(".") != -1)
			//Increment the # of rules passed by 1
			rulesPassed++;
		//Return the total # of rules address passed
		return rulesPassed;
	}
}
