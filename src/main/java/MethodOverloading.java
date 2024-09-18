
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(1);
		obj.sum(2,3);
	}
	
	//Cannot create a method inside a method
	//Cannot create dupliacte methods with exact same arguments
	
	//methodoverloading is when method name is same with different arguments and diff data types or input parameters within the same class
	public void sum() {
		System.out.println("Sum method without paramete");
	}
	
	public void sum(int i) {
		System.out.println("Sum method with one paramete" + i);
	}
	public void sum(int i, int j) {
		System.out.println("Sum method with two paramete" + i + j);
	}
	
	public static void main(String args) {

	}

}
