public class Static {
	
	// Static Variable
	static int sum = 0;
	Static(){
		sum++;
		System.out.println(sum);
	}
	
	//static method
	static int square(int x){
		return x*x;
	}
	
	
	//Static Block
	static {
		System.out.println("Hello from Static Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from static main method");
		
		//creating objects for static variable
		System.out.println("");
		System.out.println("Hello Static variable");
		Static s1 = new Static();
		Static s2 = new Static();
		
		//calling static method
		System.out.println("");
		System.out.println("Hello Static method");
		int answer = Static.square(25); 
		System.out.println(answer);
	}

}
