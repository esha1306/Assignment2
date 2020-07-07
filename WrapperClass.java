
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer wrapInt = 25;
		Double wrapDouble = 69.99;
		Character wrapChar = 'E';
		String wrapString = wrapDouble.toString();
		
		System.out.println(wrapInt);
		System.out.println(wrapChar.charValue());
		System.out.println(wrapString.length());

	}

}
