import java.util.HashSet;
import java.util.Set;

public class SubStringLength {
	
	public static void main(String[] args) {
		 String str = "esha ashok shah"; 
	        System.out.println("The input string is " + str); 
	        int len = lengthofLongSubstring(str); 
	        System.out.println("The length of "
	                           + "the longest non repeating character is " + len); 
	 
	}
public static int lengthofLongSubstring(String s) {
		
		Set<Character> charSet = new HashSet<Character>();
		int left = 0, right = 0, max = 0;
		
		while(right < s.length()) {
			if(!charSet.contains(s.charAt(right))) {
				charSet.add(s.charAt(right));
				right++;
				
				max = Math.max(max, charSet.size());
			}
			else {
				charSet.remove(s.charAt(left));
				left++;
			}
			
		}
		
		return max;
	}

}
	
