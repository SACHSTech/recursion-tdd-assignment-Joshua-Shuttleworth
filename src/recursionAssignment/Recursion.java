package recursionAssignment;

public class Recursion {
	public static int count7(int n) {
		if(n%10 == 7)
			return 1+count7(n/10);
		if(n%10 != n)
			return count7(n/10);
		return 0;
	}
}
