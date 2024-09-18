
public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x ="100";
		
		//data coversion from String to int
		int y =Integer.parseInt(x);
		System.out.println(y+10);

		//String to double conversion
		String e = "100.98";
		double d = Double.parseDouble(e);
		System.out.println(d+10);

		
		//String to boolean
		String b = "true";
		Boolean boo= Boolean.parseBoolean(b);
		System.out.println(boo+ "fal");
		
		//int to String conversion
		int i = 78;
		String v= String.valueOf(i);
		System.out.println(v+ 10);


		
		
	}

}
