
public class Pyramid {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int row = 5;
		for(int i = 0; i <= 5; i++) {
			// we need to take one variable to assign space
			for(int s = 0; s < 5 - i; s++) {
				System.out.print(" ");
			}
			
			for(int p  = 0; p <= i; p++){
				System.out.print(" * ");
				//p++;
			}
		
			System.out.println();
		}
		
	}

}
