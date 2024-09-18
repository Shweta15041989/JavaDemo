
public  class CharOccurence {

	public static  long getCountofchar(String str, char c) {
		
		return str.chars().filter(e -> (char)e==c).count();
	}
}
