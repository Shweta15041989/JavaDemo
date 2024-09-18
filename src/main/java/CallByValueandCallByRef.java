
public class CallByValueandCallByRef {

	int p;
	int q;
	
	
	public static void main(String[] args) {
		CallByValueandCallByRef ref = new CallByValueandCallByRef();
		int x = 12;
		int y = 13;
		ref.sum(x, y); //call by ref
		ref.p=10;
		ref.q=30;
	
		//After swap
		ref.swap(ref);
	}
	
	public void sum(int x, int z) {
		int d = x+z;
		System.out.println("Sum is " + d);
	}
	
	//call by ref
	public void swap(CallByValueandCallByRef r) {
		int temp;
		temp = r.p;
		r.p=r.q;
		r.q=temp;
		
		System.out.println("Swapped:" + "p is now " + r.p + " q is now " + r.q);

	}
}
