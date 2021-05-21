package recursionAssignment;

public class Recursion {
	public static int count7(int n) {
		if(n%10 == 7)
			return 1+count7(n/10);
		if(n%10 != n)
			return count7(n/10);
		return 0;
	}
	public static String changePi(String str){
        if(str.length() > 1 && (str.substring(0, 2)).equals("pi"))
			return "3.14"+changePi(str.substring(2));
        if(str.length() != 0)
            return str.substring(0, 1)+changePi(str.substring(1));
		return "";
	}
}
