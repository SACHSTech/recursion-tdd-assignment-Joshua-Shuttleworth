package recursionAssignment;

public class Recursion {

    /**
    *	Counts how many times the digit 7 is present in the given number.
    * 	@author: Joshua. S 
    */
	public static int count7(int n) {
		// Recursive Case
		if(n%10 == 7)
			return 1 + count7(n / 10);
		if(n%10 != n)
			return count7(n / 10);

		// Base Case
		return 0;
	}

	/**
    *	Change all instances of the string "pi" to "3.14".
    * 	@author: Joshua. S 
    */
	public static String changePi(String str) {
		// Recursive Case
		if(str.length() > 1 && (str.substring(0, 2)).equals("pi"))
			return "3.14" + changePi(str.substring(2));
		if(str.length() != 0)
			return str.substring(0, 1) + changePi(str.substring(1));

		// Base Case
		return "";
	}

	/**
    *	Retern true if a number in the array is followed by it's
	*	self times 10. If that never ocurse return false.
    * 	@author: Joshua. S 
    */
	public static boolean array220(int[] intNums, int index) {
		// Base Case
		if(index == intNums.length - 1)
			return false;

		// Recursive Case
		if((intNums[index] * 10) == intNums[index + 1])
			return true;
		return array220(intNums, index + 1);	
	}
}
